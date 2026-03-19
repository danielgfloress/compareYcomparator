package com.daniel.comparableComparator;

public class Persona implements Bebidas, Comparable<Persona> {

    private String nombre;
    private int chupitos;
    private int cubatas;
    private int cervezas;

    public Persona(String nombre, int chupitos, int cubatas, int cervezas) {
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

    @Override
    public int compareTo(Persona o) {
        return Integer.compare(this.getTotalBebidas(), o.getTotalBebidas());
    }
}
