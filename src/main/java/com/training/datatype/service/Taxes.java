package com.training.datatype.service;

import lombok.Getter;

@Getter
public enum Taxes {
    IVA(0.16f,"Este es el IVA"),
    ISR(0.10f,""),
    IETU(0.05f,""),;

    private Float valor;
    private String descripcion;


    Taxes(float v, String d) {
        this.valor = v;
        this.descripcion = d;
    }

}

class TaxesC{

    public static void main(String[] args) {;

        String tipoImpuesto = "ISR";

        Float tipoImpuestoValor = Taxes.valueOf(tipoImpuesto).getValor();


        Float precioTotalIva = Taxes.IVA.getValor() * 1000;

        Float precioTotalIsr = Taxes.ISR.getValor() + 1000;

        String descripcionIva = Taxes.IVA.getDescripcion().toLowerCase();

    }

}
