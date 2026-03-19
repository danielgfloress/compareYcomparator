package com.daniel.comparableComparator;

import java.util.Comparator;

public class Comparar {

    public static Comparator<Persona> porNombre = new Comparator<Persona>() {
        @Override
        public int compare(Persona p1, Persona p2) {
            return p1.getNombre().compareToIgnoreCase(p2.getNombre());
        }
    };

    public static Comparator<Persona> porChupitos = new Comparator<Persona>() {
        @Override
        public int compare(Persona p1, Persona p2) {
            return Integer.compare(p1.getChupitos(), p2.getChupitos());
        }
    };

    public static Comparator<Persona> porCubatas = new Comparator<Persona>() {
        @Override
        public int compare(Persona p1, Persona p2) {
            return Integer.compare(p1.getCubatas(), p2.getCubatas());
        }
    };

    public static Comparator<Persona> porCervezas = new Comparator<Persona>() {
        @Override
        public int compare(Persona p1, Persona p2) {
            return Integer.compare(p1.getCervezas(), p2.getCervezas());
        }
    };

    public static Comparator<Persona> porTotalDesc = new Comparator<Persona>() {
        @Override
        public int compare(Persona p1, Persona p2) {
            return Integer.compare(p2.getTotalBebidas(), p1.getTotalBebidas());
        }
    };

}
