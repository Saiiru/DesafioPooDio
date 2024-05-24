import dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando um bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java");
        bootcamp.setDescription("Bootcamp focado em Java");

        // Criando um curso
        Curso cursoJava = new Curso();
        cursoJava.setTitle("Curso de Java");
        cursoJava.setDescription("Curso completo de Java");
        cursoJava.setDuration(10);

        // Adicionando o curso ao bootcamp
        bootcamp.getContent().add(cursoJava);

        // Criando uma mentoria
        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitle("Mentoria de Java");
        mentoriaJava.setDescription("Mentoria focada em Java");
        mentoriaJava.setDate(LocalDate.now());

        // Adicionando a mentoria ao bootcamp
        bootcamp.getContent().add(mentoriaJava);

        // Criando um dev
        Dev dev = new Dev();
        dev.setName("Saiiru");

        // Inscrevendo o dev no bootcamp
        dev.subscribeBootcamp(bootcamp);

        // Imprimindo todos os conteúdos inscritos
        System.out.println("Conteúdos inscritos:");
        dev.getSubscribedContent().forEach(System.out::println);

        // Fazendo o dev progredir através do conteúdo
        dev.progression();

        // Imprimindo todos os conteúdos concluídos
        System.out.println("Conteúdos concluídos:");
        dev.getCompletedContent().forEach(System.out::println);

        // Calculando o XP total do dev
        double totalXp = dev.calculateTotalXp();
        System.out.println("Total XP: " + totalXp);
    }
}