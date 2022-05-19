package br.com.dio.model;

import java.util.Objects;

public class Dados {
    private String nome;
    private String cidade;
    private Integer idade;

    public Dados() {}

    public Dados(String nome, String cidade, Integer idade) {
        this.nome = nome;
        this.cidade = cidade;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dados dados = (Dados) o;
        return Objects.equals(nome, dados.nome) && Objects.equals(cidade, dados.cidade) && Objects.equals(idade, dados.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cidade, idade);
    }

    @Override
    public String toString() {
        return "Dados{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", idade=" + idade +
                '}';
    }
}

