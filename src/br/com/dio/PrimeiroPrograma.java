package br.com.dio;

import br.com.dio.model.Dados;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Dados dados = new Dados();
        System.out.println(dados);

        Livro livro1 = new Livro("Financeiro", 300);
        System.out.println(livro1);
        
     /*   int a = 5;
        int b = 3;
        System.out.println("CJindev");*/
    }
}

class Livro {
    private String nome;
    private Integer nmpagina;

    public Livro(String nome, Integer nmpagina) {
        this.nome = nome;
        this.nmpagina = nmpagina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNmpagina() {
        return nmpagina;
    }

    public void setNmpagina(Integer nmpagina) {
        this.nmpagina = nmpagina;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", nmpagina=" + nmpagina +
                '}';
    }
}
