package edu.joao.primeirasemana;

public class Operadores {
    public static void main(String[] args) {
        // Operadores Aritméticos: +, -, *, /, ()
        System.out.println(1 + 1);
        System.out.println(2 - 1);
        System.out.println(4 * 8);
        System.out.println(5 / 2);
        System.out.println(8 + 3 * (1+1));

        // Incremento e Decremento
        int numero = 5;

        System.out.println(++numero);
        numero--;

        System.out.println(numero);

        // Negação
        System.out.println(!true);
        System.out.println(!false);

        // Operador Ternário
        int a = 5;
        int b = 5;
        System.out.println(a == b ? "Verdadeiro" : "Falso");

        // Operadores Relacionais
        int n1 = 1;
        int n2 = 2;

        System.out.println("São iguais? : "+ (n1 == n2 ? "Sim" : "Não"));

        if(n1 < n2){
            System.out.println("n1 é menor que n2.");
        } else{
            System.out.println("n1 não é menor que n2.");
        }

        // Operadores Lógicos
        // &&: Operador "E" 
        // ||: Operador "OU"

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas codições são verdadeiras!");
        } else{
            System.out.println("Pelo menos uma das condições é falsa.");
        }

        if(condicao1 || condicao2){
            System.out.println("Pelo menos uma das condições é verdadeira.");
        } else{
            System.out.println("Nenhuma das condições é verdadeira!");
        }
    }
}
