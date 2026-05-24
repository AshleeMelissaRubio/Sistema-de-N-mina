package com.nomina.model;

import java.time.LocalDate;

public class empleado_temporal extends empleado{
    private double salarioFijoMensual;

    public empleado_temporal(int id, String nombre, LocalDate fechaIngreso, double salarioFijoMensual) {
        super(id, nombre, fechaIngreso);
        this.salarioFijoMensual = salarioFijoMensual;
    }

    @Override
    public double calcularBeneficios() {
        // No aplican bonos ni beneficios adicionales 
        return 0;
    }

    @Override
    public double calcularSalarioBruto() {
        return this.salarioFijoMensual;
    }

    //Getters and setters
    public double getSalarioFijoMensual() {
        return salarioFijoMensual;
    }

    public void setSalarioFijoMensual(double salarioFijoMensual) {
        this.salarioFijoMensual = salarioFijoMensual;
    }

    
}
