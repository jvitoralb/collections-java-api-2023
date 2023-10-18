package main.java.list.respostas;

public class Item {
    String nome;
    double preco;
    int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "{ " +
                "nome: '" + nome + '\'' +
                ", preco: " + preco  +
                ", quantidade: " + quantidade +
                " }";
    }
}
