package edu.joao.terceirasemana;
import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private List<Item> carrinhoItems;

    public CarrinhoDeCompras(){
        carrinhoItems = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoItems.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        for(Item i : carrinhoItems){
            if(i.getNome().equals(nome)){
                carrinhoItems.remove(i);
            }
        }
    }

    public void exibirItems(){
        System.out.println(carrinhoItems);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Camiseta", 80, 20);
        carrinho.adicionarItem("Notebook", 3000, 15);
        carrinho.adicionarItem("Pen-Drive", 100, 5);

        carrinho.exibirItems();

        carrinho.removerItem("Notebook");

        carrinho.exibirItems();
    }
}
