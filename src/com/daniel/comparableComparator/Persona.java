package com.daniel.comparableComparator;

import java.util.Comparator;

public class Persona implements Bebidas, Comparable<Persona> {

    private String nombre;
    private int cubatas;
    private int chupitos;
    private int cervezas;

    public Persona(String nombre, int cubatas, int chupitos, int cervezas) {
        this.nombre = nombre;
        this.chupitos = chupitos;
        this.cubatas = cubatas;
        this.cervezas = cervezas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getChupitos() {
        return chupitos;
    }

    public int getCubatas() {
        return cubatas;
    }

    public int getCervezas() {
        return cervezas;
    }

    @Override
    public void sumarChupito() {
        chupitos++;
    }

    @Override
    public void sumarCubata() {
        cubatas++;
    }

    @Override
    public void sumarCerveza() {
        cervezas++;
    }

    @Override
    public int getTotalBebidas() {
        return chupitos + cubatas + cervezas;
    }

    public static Comparator<Persona> ranking =
            Comparator.comparing(Persona::getCubatas)
                    .thenComparing(Persona::getChupitos)
                    .thenComparing(Persona::getCervezas);

    @Override
    public int compareTo(Persona o) {
        return Integer.compare(this.getTotalBebidas(), o.getTotalBebidas());
    }

}
