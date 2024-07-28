package edu.joao.segundasemana;

public class ExemploFor {
    public static void main(String [] args){
        for(int i = 0; i < 20; i++){
            System.out.println("Contando carneirinhos: "+(i+1));
        }

        System.out.println();

        String alunos[] = {"João", "Luiz", "Gabriel", "Mônica"};

        for(int i = 0; i < alunos.length; i++){
            System.out.println("O aluno do indice "+i+" é: "+alunos[i]);
        }
    }
}
