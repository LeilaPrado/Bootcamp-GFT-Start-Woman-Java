package Exercicios_Collections.Map;

import java.util.Objects;

public class Livros {

    String nome;
    Integer paginas;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return Objects.equals(nome, livros.nome) && Objects.equals(paginas, livros.paginas);
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public Livros(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }
}
