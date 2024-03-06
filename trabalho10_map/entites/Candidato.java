package trabalho10_map.entites;

import java.util.Objects;

public class Candidato {
    private String nome;
    private int quantVotos;

    public Candidato(String nome, int quantVotos) {
        this.nome = nome;
        this.quantVotos = quantVotos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantVotos() {
        return quantVotos;
    }

    public void setQuantVotos(int quantVotos) {
        this.quantVotos = quantVotos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato = (Candidato) o;
        return quantVotos == candidato.quantVotos && Objects.equals(nome, candidato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, quantVotos);
    }
}
