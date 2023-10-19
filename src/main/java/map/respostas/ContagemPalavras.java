package main.java.map.respostas;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavras(String p, Integer c) {
        palavras.put(p, c);
    }
    public void removerPalavra(String p) {
        if (palavras.isEmpty()) {
            System.out.println("O map está vazio!");
            return;
        }
        palavras.remove(p);
    }
    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int c : palavras.values()) {
            contagemTotal += c;
        }
        return contagemTotal;
    }
    public String encontrarPalavrasMaisFrequente() {
        if (palavras.isEmpty()) {
            return "O map está vazio!";
        }
        String palavraMaisFrequente = null;
        int maiorContagem = 0;

        for(Map.Entry<String, Integer> e : palavras.entrySet()) {
            if (e.getValue() > maiorContagem) {
                maiorContagem = e.getValue();
                palavraMaisFrequente = e.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavras("Java", 2);
        contagemLinguagens.adicionarPalavras("Python", 8);
        contagemLinguagens.adicionarPalavras("JavaScript", 1);
        contagemLinguagens.adicionarPalavras("C#", 6);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
