package edu.joao.segundasemana;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(true){
            Double valorDoce = valorAleatorio();
            if(valorDoce <= mesada){
                mesada -= valorDoce;
                System.out.println("Doce: R$ -"+valorDoce);
                System.out.println("Mesada Atual: R$ "+mesada);
                System.out.println();
                continue;
            }
            System.out.println("Doce: R$ "+valorDoce);
            System.out.println("Mesada Insuficiente: R$ "+mesada);
            break;
        }
    }

    public static double valorAleatorio(){
        return Math.round(1 + Math.random() * 9);
    }
}
