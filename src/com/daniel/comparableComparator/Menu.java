package com.daniel.comparableComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Menu {

    public static void mostrarTabla(ArrayList<Persona> grupo) {
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%-10s %8s %8s %8s %8s%n",
                "Nombre", "Cub", "Chup", "Cerv", "Total");
        System.out.println("-------------------------------------------------------------------");

        int posicion = 1;
        for (Persona p : grupo) {
            System.out.printf("%-10s %8d %8d %8d %8d%n",
                    p.getNombre(),
                    p.getCubatas(),
                    p.getChupitos(),
                    p.getCervezas(),
                    p.getTotalBebidas()
            );
            posicion++;
        }

        System.out.println("-------------------------------------------------------------------");
    }


    public static void menu() {

        Persona p1  = new Persona("Daniel",3,5,4);
        Persona p2  = new Persona("Carlos",4,6,3);
        Persona p3  = new Persona("Diego",3,6,2);

        ArrayList<Persona> grupo = new ArrayList<>();
        grupo.add(p1);
        grupo.add(p2);
        grupo.add(p3);

        Collections.sort(grupo, Persona.ranking.reversed());
        System.out.println("=== Ranking por bebidas ===");
        mostrarTabla(grupo);

        Collections.sort(grupo, Collections.reverseOrder());
        System.out.println("=== Ranking por total ===");
        mostrarTabla(grupo);

    }

}
