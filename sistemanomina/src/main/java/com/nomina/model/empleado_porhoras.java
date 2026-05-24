package com.nomina.model;

import java.time.LocalDate;

import com.nomina.exception.ValidacionNominaException;

public class empleado_porhoras extends empleado {
    private int horasTrabajadas;
    private double tarifaBaseHora;
    private boolean aceptaFondoAhorro;

    

    public empleado_porhoras(int id, String nombre, LocalDate fechaIngreso, int horasTrabajadas, double tarifaBaseHora,
        boolean aceptaFondoAhorro) {
        super(id, nombre, fechaIngreso);

        if (horasTrabajadas < 0) {
            throw new ValidacionNominaException("Las horas trabajadas no pueden ser negativas");
        }

        this.horasTrabajadas = horasTrabajadas;
        this.tarifaBaseHora = tarifaBaseHora;
        this.aceptaFondoAhorro = aceptaFondoAhorro;
    }

    @Override
    public double calcularBeneficios() {
        double beneficios = 0;

        if (getAniosEnEmpresa() > 1 && aceptaFondoAhorro) {
            beneficios += calcularSalarioBruto() * 0.02;
        }
        return beneficios;
    }

    @Override
    public double calcularSalarioBruto() {
        if (this.horasTrabajadas <= 40) {
            return this.horasTrabajadas * this.tarifaBaseHora;
        } else {
            int horasNormales = 40;
            int horasExtras = this.horasTrabajadas - 40;
            return (horasNormales * this.tarifaBaseHora) + (horasExtras * this.tarifaBaseHora * 1.5);
        }
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaBaseHora() {
        return tarifaBaseHora;
    }

    public void setTarifaBaseHora(double tarifaBaseHora) {
        this.tarifaBaseHora = tarifaBaseHora;
    }

    public boolean isAceptaFondoAhorro() {
        return aceptaFondoAhorro;
    }

    public void setAceptaFondoAhorro(boolean aceptaFondoAhorro) {
        this.aceptaFondoAhorro = aceptaFondoAhorro;
    }

}
