package main.java.list.respostas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<Integer>();
    }

    public void adicionarNumero(int num) {
        numeros.add(num);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ordernarNumeros = new ArrayList<>(this.numeros);
        if (!numeros.isEmpty()) {
            Collections.sort(ordernarNumeros);
            return ordernarNumeros;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ordernarNumeros = new ArrayList<>(this.numeros);
        if (!numeros.isEmpty()) {
            ordernarNumeros.sort(Collections.reverseOrder());
            return ordernarNumeros;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }
}
