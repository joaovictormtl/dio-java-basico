package edu.joao.segundasemana;

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do{
            System.out.println("Telefone Tocando...");
        } while(tocando());
        System.out.println("Alô!");
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        return !atendeu;
    }
}