package edu.joao.terceirasemana;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaOrdenada = new ArrayList<>(pessoaList);
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaOrdenada = new ArrayList<>(pessoaList);
        Collections.sort(listaOrdenada, new ComparatorPorAltura());
        return listaOrdenada;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas pessoasOrdenadas = new OrdenacaoPessoas();
        pessoasOrdenadas.adicionarPessoa("João", 22, 1.77);
        pessoasOrdenadas.adicionarPessoa("Rejane", 53, 1.68);
        pessoasOrdenadas.adicionarPessoa("Roselito", 55, 1.75);
        pessoasOrdenadas.adicionarPessoa("Raul", 40, 1.70);
        pessoasOrdenadas.adicionarPessoa("Johnny", 71, 1.91);
        pessoasOrdenadas.adicionarPessoa("Mike", 63, 1.78);
        
        System.out.println(pessoasOrdenadas.ordenarPorIdade());
        System.out.println(pessoasOrdenadas.ordenarPorAltura());
    }
}
