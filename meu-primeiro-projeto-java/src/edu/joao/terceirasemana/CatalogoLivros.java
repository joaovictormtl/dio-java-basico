package edu.joao.terceirasemana;
import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> autorLivros = new ArrayList<>();
        
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equals(autor)){
                    autorLivros.add(l);
                }
            }
        }
        return autorLivros;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosIntervalo = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosIntervalo.add(l);
                }
            }
        }
        return livrosIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equals(titulo)){
                    livroPorTitulo = l;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("O Alienista", "Machado de Assis", 1880);
        catalogoLivros.adicionarLivro("Dom Casmurro", "Machado de Assis", 1900);
        catalogoLivros.adicionarLivro("A Revolução dos Bichos", "George Orwell", 1940);
        catalogoLivros.adicionarLivro("Meditações", "Marco Aurélio", 800);
        catalogoLivros.adicionarLivro("A República", "Platão", -400);
        catalogoLivros.adicionarLivro("Fédon", "Platão", -390);
        catalogoLivros.adicionarLivro("Metafísica", "Aristóteles", -370);

        System.out.println(catalogoLivros.pesquisarPorAutor("Machado de Assis"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(-400, -300));
        System.out.println(catalogoLivros.pesquisarPorTitulo("A Revolução dos Bichos"));
    }

}
