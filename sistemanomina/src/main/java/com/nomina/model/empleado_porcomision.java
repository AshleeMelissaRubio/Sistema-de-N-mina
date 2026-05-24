package com.nomina.model;

import com.nomina.exceptions.ValidacionNominaException;

public class empleado_porcomision extends empleado{
    private double salarioBase;
    private double ventasRealizadas;
    private double porcentajeComision;

    public empleado_porcomision(int id, String nombre, String tipoEmpleado, int antiguedadAnios, double salarioBase,
            double ventasRealizadas, double porcentajeComision) {
        super(id, nombre, tipoEmpleado, antiguedadAnios);

        if (ventasRealizadas < 0) {
            throw new ValidacionNominaException("Las ventas de un empleado por comisión no pueden ser menores a 0");
        }

        this.salarioBase = salarioBase;
        this.ventasRealizadas = ventasRealizadas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularBeneficios() {
        double beneficios = 0;

        // Si las ventas superan $20.000.000 gana 3% extra sobre las ventas
        if (this.ventasRealizadas > 20000000) {
            beneficios += this.ventasRealizadas * 0.03;
        }

        // Bono de alimentación permanente
        beneficios += 1000000.0;

        return beneficios;
    }

    @Override
    public double calcularSalarioBruto() {
        double comisionNormal = this.ventasRealizadas * (this.porcentajeComision / 100);
        return this.salarioBase + comisionNormal;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(double ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

}


