package main.java.list.respostas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> comprasList;

    public CarrinhoDeCompras() {
        comprasList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        for (Item it : comprasList) {
            if (it.nome.equals(nome)) {
                it.quantidade += quantidade;
                return;
            }
        }
        Item item = new Item(nome, preco, quantidade);
        comprasList.add(item);
    }

    public void removerItem(String nome) {
        for(int i = 0; i < comprasList.size(); i++) {
            if (comprasList.get(i).nome.equals(nome)) {
                comprasList.remove(i);
                break;
            }
        }
    }

    public double calcularValorTotal() {
        double valorDasCompras = 0;

        for(Item it : comprasList) {
            valorDasCompras += (it.preco * it.quantidade);
        }

        return valorDasCompras;
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + comprasList +
                '}';
    }

    public void exibirItens() {
        if (!comprasList.isEmpty()) {
            System.out.println(comprasList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
