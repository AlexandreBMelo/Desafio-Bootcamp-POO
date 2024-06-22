package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    // Atributos
    private int cargaHoraria;

    // Construtor
    public Curso() {
    }

    @Override
    public double caucularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Métodos
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }

}
