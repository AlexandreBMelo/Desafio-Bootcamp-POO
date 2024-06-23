import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Live;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Dominando IDE's JAVA");
        curso1.setDescricao("Aprenda sobre as IDE's");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("APRENDENDO JAVA COLLECTIONS");
        curso2.setDescricao("Aprenda sobre as Collections mais utilizadas");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Aprenda JAVA");
        mentoria.setDescricao("Mentoria JAVA");
        mentoria.setData(LocalDate.now());

        Live live = new Live();
        live.setTitulo("Live de Abertura");
        live.setDescricao("Vamos nos apresentar e discutir a proposta do curso");
        live.setDataLive(LocalDate.of(2024, 06, 25));

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria1);
        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Santander Java Back-End");
        bootcampJava.setDescricao("Bootcamp focado em desenvolvimento java para Back-End");
        
        bootcampJava.getConteudosBootcamp().add(live);
        bootcampJava.getConteudosBootcamp().add(curso1);
        bootcampJava.getConteudosBootcamp().add(curso2);
        bootcampJava.getConteudosBootcamp().add(mentoria);

        Dev alexandre = new Dev();
        alexandre.setNome("Alexandre Melo");
       alexandre.inscreverBootcamp(bootcampJava);
     

       System.out.println("Conteúdos inscritos: " + alexandre.getConteudosInscrito());

       alexandre.progredir();
       alexandre.progredir();
       alexandre.progredir();

       System.out.println("Conteúdos concluídos: " + alexandre.getConteudosConcluidos());
       System.out.println(alexandre.caucularTotalXp());
       alexandre.gerarCertificado();
       alexandre.progredir();
       System.out.println("Conteúdos concluídos: " + alexandre.getConteudosConcluidos());
       alexandre.gerarCertificado();


    }

}
