package main.java.set.respostas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String d) {
        tarefaSet.add(new Tarefa(d));
    }
    public void removerTarefa(String d) {
        if (tarefaSet.isEmpty()) {
            System.out.println("Lista de tarefas está vazia!");
            return;
        }

        Tarefa alvo = null;

        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(d)) {
                alvo = t;
                break;
            }
        }

        if (alvo == null) {
            System.out.println("A tarefa não existe!");
        } else {
            tarefaSet.remove(alvo);
        }
    }
    public void exibirTarefas() {
        if(!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }
    public int contarTarefas() {
        return tarefaSet.size();
    }
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> concluidas = new HashSet<>();

        for(Tarefa t : tarefaSet) {
            if (t.isConcluida()) {
                concluidas.add(t);
            }
        }
        return concluidas;
    }
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> pendentes = new HashSet<>();

        for(Tarefa t : tarefaSet) {
            if (!t.isConcluida()) {
                pendentes.add(t);
            }
        }
        return pendentes;
    }
    public void marcarTarefaConcluida(String d) {
        for(Tarefa t : tarefaSet) {
            if (t.getDescricao().equals(d)) {
                t.setConcluido(true);
                break;
            }
        }
    }
    public void marcarTarefaPendente(String d) {
        for(Tarefa t : tarefaSet) {
            if (t.getDescricao().equals(d)) {
                t.setConcluido(false);
                break;
            }
        }
    }
    public void limparListaTarefas() {
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
