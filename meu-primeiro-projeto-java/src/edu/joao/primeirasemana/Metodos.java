package edu.joao.primeirasemana;

public class Metodos {
    public static void main(String [] args){
        // Deve ser nomeado como verbo
        // Deve seguir o padrão camelCase
        System.out.println(somar(5.6, 3));
        System.out.println(dividir(5.6, 3));
    }

    public static double somar(double n1, double n2){
        return n1 + n2;
    }

    public static double dividir(double dividendo, double divisor){
        return dividendo/divisor;
    }
}
