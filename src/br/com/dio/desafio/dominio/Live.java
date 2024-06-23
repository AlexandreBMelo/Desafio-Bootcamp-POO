package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Live extends Conteudo{

    private LocalDate dataLive;
    
    @Override
    public double caucularXp() {
        return XP_PADRAO + 200d;
    }

    public LocalDate getDataLive() {
        return dataLive;
    }

    public void setDataLive(LocalDate dataLive) {
        this.dataLive = dataLive;
    }

    @Override
    public String toString() {
        return "Live [Nome: " + getTitulo() + " Descrição: " + getDescricao() + " Data: " + getDataLive() + "]" ;
    }

    
 
}
