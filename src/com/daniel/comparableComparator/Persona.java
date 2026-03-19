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

    Comparator<Persona> rankingAnonimo = new Comparator<Persona>() {
        @Override
        public int compare(Persona p1, Persona p2) {
            return Integer.compare(p1.getCubatas(), p2.getCubatas());
        }
    };

    public static Comparator<Persona> rankingLambda = (p1, p2) -> {

        int cubatas = Integer.compare(p1.getCubatas(), p2.getCubatas());
        if (cubatas != 0) return cubatas;

        int chupitos = Integer.compare(p1.getChupitos(), p2.getChupitos());
        if (chupitos != 0) return chupitos;

        return Integer.compare(p1.getCervezas(), p2.getCervezas());
    };

    public static Comparator<Persona> rankingComparing =
            Comparator.comparing(Persona::getCubatas)
                    .thenComparing(Persona::getChupitos)
                    .thenComparing(Persona::getCervezas);

    @Override
    public int compareTo(Persona o) {
        return Integer.compare(this.getTotalBebidas(), o.getTotalBebidas());
    }

}
