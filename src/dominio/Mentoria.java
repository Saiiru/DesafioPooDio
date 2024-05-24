package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
      private LocalDate date;

    @Override
    public double calculateXp() {
        return XP_DEFAULT * 1.5;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
