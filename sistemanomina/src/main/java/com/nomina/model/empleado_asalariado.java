package com.nomina.model;

import java.time.LocalDate;

public class empleado_asalariado extends empleado {
    private double salarioFijoMensual;

    public empleado_asalariado(int id, String nombre, LocalDate fechaIngreso, double salarioFijoMensual) {
        super(id, nombre, fechaIngreso);
        this.salarioFijoMensual = salarioFijoMensual;
    }

    @Override
    public double calcularSalarioBruto() {
        return this.salarioFijoMensual;
    }

    @Override
    public double calcularBeneficios() {
        double beneficios = 0;

        //Bono del 10% por más de 5 años de antiguedad
        if (getAniosEnEmpresa() > 5) {
            beneficios += this.salarioFijoMensual * 0.10;
        }

        //Bono de alimentación permanente
        beneficios += 1000000.0;

        return beneficios;
    }

    public double getSalarioFijoMensual() {
        return salarioFijoMensual;
    }

    public void setSalarioFijoMensual(double salarioFijoMensual) {
        this.salarioFijoMensual = salarioFijoMensual;
    }
}
