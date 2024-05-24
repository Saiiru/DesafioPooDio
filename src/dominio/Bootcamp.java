package dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private LocalDate initialDate = LocalDate.now();
    private LocalDate finalDate = LocalDate.now().plusMonths(2);
    private Set<Dev> subscribedDevs = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(LocalDate initialDate) {
        this.initialDate = initialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(LocalDate finalDate) {
        this.finalDate = finalDate;
    }

    public Set<Dev> getSubscribedDevs() {
        return subscribedDevs;
    }

    public void setSubscribedDevs(Set<Dev> subscribedDevs) {
        this.subscribedDevs = subscribedDevs;
    }

    public Set<Conteudo> getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(initialDate, bootcamp.initialDate) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(subscribedDevs, bootcamp.subscribedDevs) && Objects.equals(content, bootcamp.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, initialDate, finalDate, subscribedDevs, content);
    }

    public void setContent(Set<Conteudo> content) {
        this.content = content;
    }

    private Set<Conteudo> content = new HashSet<>();
}

