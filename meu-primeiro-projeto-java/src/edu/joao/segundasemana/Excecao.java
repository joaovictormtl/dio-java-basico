package edu.joao.segundasemana;

import java.util.Scanner;
import java.util.Locale;

public class Excecao {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = input.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = input.next();
        
        System.out.print("Digite a sua idade: ");
        int idade = input.nextInt();

        System.out.print("Digite a sua altura: ");
        double altura = input.nextDouble();

        System.out.println();

        System.out.println("Olá, me chamo "+ nome +" "+ sobrenome+".");
        System.out.println("Tenho "+idade+" anos de idade.");
        System.out.println("Minha altura é de "+altura+"cm.");

        input.close();
    }
}
