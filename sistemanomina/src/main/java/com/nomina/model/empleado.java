package com.nomina.model;

import java.time.LocalDate;
import java.time.Period;

public abstract class empleado {
    private int id;
    private String nombre;
    private LocalDate fechaIngreso;
    
    public empleado(int id, String nombre, LocalDate fechaIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
    }

    public int getAniosEnEmpresa() {
        return Period.between(fechaIngreso, LocalDate.now()).getYears();
    }

    // Métodos abstractos que cada tipo de empleado calculará a su manera
    public abstract double calcularSalarioBruto();
    public abstract double calcularBeneficios();

    public double calcularDeducciones() {
        double salarioBruto = calcularSalarioBruto();
        double saludYPension = salarioBruto * 0.04;
        double arl = calcularARL();
        return saludYPension + arl;
    }

    public double calcularSalarioNeto() {
        double neto = calcularDeducciones() * calcularBeneficios() - calcularDeducciones();
        return Math.max(neto, 0);
    }

    protected double  calcularARL() {
        return calcularDeducciones() * 0.00522;
    }

    //Getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    
}
