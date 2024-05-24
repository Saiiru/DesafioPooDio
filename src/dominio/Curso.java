package dominio;

public class Curso extends Conteudo {
    private int duration;

   public int getDuration() {
        return duration;
    }

    @Override
    public double calculateXp() {
        return XP_DEFAULT * 2;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    @Override
    public String toString() {
        return "Curso{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                '}';
    }


}
