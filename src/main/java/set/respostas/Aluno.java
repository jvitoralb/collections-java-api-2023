package main.java.set.respostas;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    String nome;
    long matricula;
    double media;

    public Aluno(String nome, long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return getMatricula() == aluno.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareTo(a.getNome());
    }
}

class ComparatorPorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}
