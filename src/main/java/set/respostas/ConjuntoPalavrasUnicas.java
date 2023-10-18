package main.java.set.respostas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> conjunto;

    public ConjuntoPalavrasUnicas() {
        this.conjunto = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        conjunto.add(palavra);
    }
    public void removerPalavra(String palavra) {
        if (conjunto.isEmpty()) {
            System.out.println("O conjunto está vazio!");
            return;
        }

        if (conjunto.contains(palavra)) {
            conjunto.remove(palavra);
        } else {
            System.out.println("Palavra não encontrada no conjunto!");
        }
    }
    public boolean verificarPalavra(String palavra) {
        return conjunto.contains(palavra);
    }
    public void exibirPalavrasUnicas() {
        if(conjunto.isEmpty()) {
            System.out.println("O conjunto está vazio!");
        } else {
            System.out.println(conjunto);
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}
