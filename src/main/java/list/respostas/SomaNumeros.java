package main.java.list.respostas;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numeros;

    public SomaNumeros() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int num) {
        numeros.add(num);
    }

    public int calcularSoma() {
        int soma = 0;

        for(int n : numeros) {
            soma += n;
        }

        return soma;
    }

    public int encontrarMaiorNumero() {
        if (!numeros.isEmpty()) {
            int n = numeros.get(0);

            for(int i = 1; i < numeros.size(); i++) {
                if (numeros.get(i) > n) {
                    n = numeros.get(i);
                }
            }

            return n;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero() {
        if (!numeros.isEmpty()) {
            int n = numeros.get(0);

            for(int i = 1; i < numeros.size(); i++) {
                if (numeros.get(i) < n) {
                    n = numeros.get(i);
                }
            }

            return n;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
