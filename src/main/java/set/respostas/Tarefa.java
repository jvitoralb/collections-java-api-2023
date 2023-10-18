package main.java.set.respostas;

public class Tarefa {
    String descricao;
    boolean concluida = false;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluido(boolean concluido) {
        this.concluida = concluido;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
