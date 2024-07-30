package edu.joao.segundasemana;

import java.util.Scanner;
import java.util.Locale;

public class CalcularMedias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        String [] alunos = {"João", "Luiz", "Rejane", "Roselito"};
        double [] medias = calcularMedias(alunos, input);
        double mediaTurma = calcularMediaTurma(medias);

        mostrarMedias(alunos, medias);
        System.out.println("Média da Turma: "+mediaTurma);
    }

    public static double [] calcularMedias(String [] alunos, Scanner input){
        double [] medias = new double[alunos.length];
        
        for(int i = 0; i < alunos.length; i++){
            double soma = Double.MIN_VALUE;
            for(int j = 0; j < 2; j++){
                System.out.printf("Aluno(a) - %s - Nota %d: ", alunos[i], j+1);
                double nota = input.nextDouble();
                soma += nota;
            }
            System.out.println();
            double media = soma / 2;
            medias[i] = media;
        }
        return medias;
    }

    public static double calcularMediaTurma(double [] medias){
        double mediaTurma = Double.MIN_VALUE;
        for(double media : medias){
            mediaTurma += media;
        }
        return mediaTurma /= medias.length;
    }

    public static void mostrarMedias(String [] alunos, double [] medias){
        for(int i = 0; i < alunos.length; i++){
            System.out.println("Aluno(a) "+alunos[i]+" - Média: "+medias[i]);
        }
    }
    
}
