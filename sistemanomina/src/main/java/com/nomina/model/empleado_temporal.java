package com.nomina.model;

public class empleado_temporal extends empleado{
    private double salarioFijoMensual;

    public empleado_temporal(int id, String nombre, String tipoEmpleado, int antiguedadAnios,
            double salarioFijoMensual) {
        super(id, nombre, tipoEmpleado, antiguedadAnios);
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

    public double getSalarioFijoMensual() {
        return salarioFijoMensual;
    }

    public void setSalarioFijoMensual(double salarioFijoMensual) {
        this.salarioFijoMensual = salarioFijoMensual;
    }

    
}
