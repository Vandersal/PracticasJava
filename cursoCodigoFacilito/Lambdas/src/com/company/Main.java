package com.company;

public class Main {

    public static void main(String[] args) {
        ISaludo saludar = nombre -> {System.out.println("Hola mundo " + nombre);};
        saludar.Saluda("Vandersal");

    }
}
