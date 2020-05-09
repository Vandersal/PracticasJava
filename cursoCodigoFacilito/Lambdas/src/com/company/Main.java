package com.company;

public class Main {

    public static void main(String[] args) {
        ISaludo saludar = nombre -> {System.out.println("Hola mundo " + nombre);};
        saludar.Saluda("Vandersal");

        ISaludo saludarDos = nombre ->{
            if (nombre.equals("Vandersal")){
                System.out.println("Tienes el mismo nombre");
            }
            else{
                System.out.println("Hola mundo " + nombre);
            }
        };

        saludarDos.Saluda("Vandersal");

    }
}
