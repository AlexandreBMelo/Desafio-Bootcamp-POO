package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos= new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscrito.addAll(bootcamp.getConteudosBootcamp());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscrito.stream().findFirst();

        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscrito.remove(conteudo.get());
        } else {
            System.err.println("Você não está mátriculado em nenhum conteúdo;");
        }
    }

    public double caucularTotalXp(){
        return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.caucularXp()).sum();


    }
    public void gerarCertificado(){
        if (conteudosInscrito.isEmpty() && !conteudosConcluidos.isEmpty()) {
            System.out.println("Parabéns, você concluíu o Bootcamp");
        } else {
            System.out.println("Volte aqui quando concluir todos os cursos inscrítos");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscrito() {
        return conteudosInscrito;
    }


    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudosInscrito == null) ? 0 : conteudosInscrito.hashCode());
        result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudosInscrito == null) {
            if (other.conteudosInscrito != null)
                return false;
        } else if (!conteudosInscrito.equals(other.conteudosInscrito))
            return false;
        if (conteudosConcluidos == null) {
            if (other.conteudosConcluidos != null)
                return false;
        } else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
            return false;
        return true;
    }

    
}
