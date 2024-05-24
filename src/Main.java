import dominio.Curso;

public class Main {
    public static void main(String[] args) {
       Curso curso = new Curso();
       curso.setTitle("Java");
       curso.setDescription("Curso de Java");
       curso.setDuration(8);

       System.out.println(curso);
    }
}