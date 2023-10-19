package main.java.map.respostas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> dicionario;

    public Dicionario() {
        dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String p, String d) {
        dicionario.put(p, d);
    }
    public void removerPalavra(String p) {
        if (dicionario.isEmpty()) {
            System.out.println("O map está vazio!");
            return;
        }

        dicionario.remove(p);
    }
    public void exibirPalavras() {
        System.out.println(dicionario);
    }
    public String pesquisarPorPalavra(String p) {
        String def = dicionario.get(p);
        if (def == null) {
            return "Linguagem não encontrada no dicionário.";
        }
        return def;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        // Adicionar palavras (linguagens de programação)
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        // Exibir todas as palavras
        dicionario.exibirPalavras();

        // Pesquisar palavras
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        // Remover uma palavra
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}
