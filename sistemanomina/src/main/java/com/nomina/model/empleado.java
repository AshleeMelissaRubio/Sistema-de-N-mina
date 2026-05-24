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
