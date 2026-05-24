package com.nomina.model;

public abstract class empleado {
    private int id;
    private String nombre;
    private String tipoEmpleado;
    private int antiguedadAnios;

    public empleado(int id, String nombre, String tipoEmpleado, int antiguedadAnios) {
        this.id = id;
        this.nombre = nombre;
        this.tipoEmpleado = tipoEmpleado;
        this.antiguedadAnios = antiguedadAnios;
    }
    
    // Métodos abstractos que CADA tipo de empleado calculará a su manera
    public abstract double calcularSalarioBruto();
    public abstract double calcularBeneficios();

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipoEmpleado() { return tipoEmpleado; }
    public void setTipoEmpleado(String tipoEmpleado) { this.tipoEmpleado = tipoEmpleado; }

    public int getAntiguedadAnios() { return antiguedadAnios; }
    public void setAntiguedadAnios(int antiguedadAnios) { this.antiguedadAnios = antiguedadAnios; }
}
