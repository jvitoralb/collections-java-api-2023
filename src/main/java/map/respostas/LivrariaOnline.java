package main.java.map.respostas;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        livrosMap.put(link, livro);
    }
    public void removerLivro(String titulo) {
        String livroAlvo = null;

        for(Map.Entry<String, Livro> e : livrosMap.entrySet()) {
            if (e.getValue().getTitulo().equals(titulo)) {
                livroAlvo = e.getKey();
                break;
            }
        }

        if (livroAlvo == null) {
            System.out.println("Livro não encontrado!");
        } else {
            livrosMap.remove(livroAlvo);
        }
    }
    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> ordenarPorPreco = new ArrayList<>(livrosMap.entrySet());

        Collections.sort(ordenarPorPreco, new ComparatorPorPreco());

        Map<String, Livro> ordenados = new LinkedHashMap<>();

        for(Map.Entry<String, Livro> e : ordenarPorPreco) {
            ordenados.put(e.getKey(), e.getValue());
        }

        return ordenados;
    }
    public List<Livro> pesquisarLivrosPorAutor(String a) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        for(Map.Entry<String, Livro> e : livrosMap.entrySet()) {
            if (e.getValue().getAutor().equals(a)) {
                livrosPorAutor.add(e.getValue());
            }
        }

        return livrosPorAutor;
    }
    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> ordenarPorAutor = new ArrayList<>(livrosMap.entrySet());

        Collections.sort(ordenarPorAutor, new ComparatorPorAutor());

        Map<String, Livro> ordenados = new LinkedHashMap<>();

        for(Map.Entry<String, Livro> e : ordenarPorAutor) {
            ordenados.put(e.getKey(), e.getValue());
        }

        return ordenados;
    }
    public List<Livro> obterLivroMaisCaro() {
        if (livrosMap.isEmpty()) {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        List<Livro> livrosAlvo = new ArrayList<>();
        double maiorPreco = 0d;

        for(Livro l : livrosMap.values()) {
            if (maiorPreco < l.getPreco()) {
                maiorPreco = l.getPreco();
            }
        }

        for(Map.Entry<String, Livro> e : livrosMap.entrySet()) {
            if (e.getValue().getPreco() == maiorPreco) {
                livrosAlvo.add(e.getValue());
            }
        }

        return livrosAlvo;
    }
    public List<Livro> obterLivroMaisBarato() {
        if (livrosMap.isEmpty()) {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        List<Livro> livrosAlvo = new ArrayList<>();
        double menorPreco = Double.MAX_VALUE;

        for(Livro l : livrosMap.values()) {
            if (menorPreco > l.getPreco()) {
                menorPreco = l.getPreco();
            }
        }

        for(Map.Entry<String, Livro> e : livrosMap.entrySet()) {
            if (e.getValue().getPreco() == menorPreco) {
                livrosAlvo.add(e.getValue());
            }
        }

        return livrosAlvo;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        //Exibe todos os livros ordenados por autor
        System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());

        // Pesquisa livros por autor
        String autorPesquisa = "Josh Malerman";
        livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);

        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

        // Remover um livro pelo título
        livrariaOnline.removerLivro("1984");
        System.out.println(livrariaOnline.livrosMap);

    }
}
