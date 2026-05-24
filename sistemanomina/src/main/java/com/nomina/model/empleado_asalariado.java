package com.nomina.model;

public class empleado_asalariado extends empleado {
    private double salarioFijoMensual;

    public empleado_asalariado(int id, String nombre, String tipoEmpleado, int antiguedadAnios,
            double salarioFijoMensual) {
        super(id, nombre, tipoEmpleado, antiguedadAnios);
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
        if (getAntiguedadAnios() > 5) {
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
