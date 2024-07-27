package edu.joao.primeirasemana;
import java.util.Locale;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = input.nextLine();

        System.out.print("Ditie a sua altura: ");
        double altura = input.nextDouble();

        System.out.print("Digite a sua idade: ");
        int idade = input.nextInt();

        System.out.println("Nome: "+nome);
        System.out.println("Sobrenome: "+sobrenome);
        System.out.println("Idade: "+idade);
        System.out.println("Altura: "+altura);
        input.close();
    }
}
