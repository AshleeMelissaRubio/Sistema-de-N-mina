package com.nomina.exceptions;

public class DatoNegativoException extends ValidacionNominaException{
    //constructor
    public DatoNegativoException(String campo, double valorInvalido) {
        super(String.format("Error de nomina: El campo '%s' no puede recibir valores negativos. Valor ingresado: [%.2f]", campo, valorInvalido));
    }
}
