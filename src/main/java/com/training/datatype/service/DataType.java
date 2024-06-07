package com.training.datatype.service;

import java.util.ArrayList;
import java.util.List;

public class DataType {

    // tipos primitivos
    byte primitiveByte = 0;

    short primitiveShort = 0;

    int  primitiveInt = 4;

    long primitiveLong = 4L;

    float primitiveFloat = 0.0f;

    double primitiveDouble = 0.0d;

    char character = 'a';

    boolean booleanValue = false;


    //tipos wrapper
    Byte wrapperByte = 0;

    Short wrapperShort = 0;

    Integer wrapperInt  = 0;

    Long wrapperLong = 0L;

    Float wrapperFloat = null ;

    Double wrapperDouble;

    Character wrapperCharacter;

    Boolean wrapperBoolean;

    String string;


    public void example() {


        int a= 1;

        int b=2;

        int c= a+b;

        Double number = 1.0;

        if(number.isInfinite()) {
            System.out.println("Es infinito");
        }

        System.out.println("Suma de a y b: "+c);


        Integer d= 1;
        int e= 2;

        Integer f= d+e;



        Long lo= f.longValue();

        byte by= f.byteValue();

        long lop = f.longValue();


        System.out.println("Suma de d y e: "+f);


        String str= "Hola";

        char ch= 'a';

        String str2= ch + str;

        StringBuilder strb= null;


    }


    public String contabilidadProductos(int valorInicial, int valorFinal){

        int valorInicialProducto = valorInicial;
        int valorFinalProducto = valorFinal;

        Integer valorTotal = valorInicialProducto + valorFinalProducto;

        Float impuestoTotal = valorTotal * 0.16f;

        return valorTotal.toString();
    }



    public void saveDB(){
        String contabilidadTtotal= contabilidadProductos(100, 200);


        // autoboxing
        int num = 5;

        Integer numWrapper = num;

        // unboxing

        Integer numWrapper2 = 5;

        int num2 = numWrapper2;

        ///

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        int n= list.get(0);

        List<Float> listFloat = new ArrayList<>();
        listFloat.add(1f);
        listFloat.add(2f);
        listFloat.add(3f);

        int n2= listFloat.get(0).intValue();

    }
}

