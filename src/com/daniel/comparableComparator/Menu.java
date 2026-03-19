package com.daniel.comparableComparator;

import java.util.ArrayList;

public class Menu {

    public static void menu() {

        Persona p1  = new Persona("Daniel",5,3,4);
        Persona p2  = new Persona("Carlos",6,4,3);
        Persona p3  = new Persona("Diego",6,3,2);



    }

    public static void mostrarTabla(ArrayList<Persona> grupo) {
        System.out.println("------------------------------------------------------");
        System.out.printf("%-10s %8s %8s %8s %8s%n",
                "Nombre", "Chup.", "Cub.", "Cerv.", "Total");
        System.out.println("------------------------------------------------------");

        for (Persona p : grupo) {
            System.out.println(p);
        }

        System.out.println("------------------------------------------------------");
    }


}
