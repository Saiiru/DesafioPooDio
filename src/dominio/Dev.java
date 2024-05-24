package dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Conteudo> subscribedContent = new LinkedHashSet<>();
    private Set<Conteudo> completedContent = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp) {
    }

    public void progression(){};

    public void calculateTotalXp(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Conteudo> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Conteudo> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public Set<Conteudo> getCompletedContent() {
        return completedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContent, dev.subscribedContent) && Objects.equals(completedContent, dev.completedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContent, completedContent);
    }

    public void setCompletedContent(Set<Conteudo> completedContent) {
        this.completedContent = completedContent;

    }
}
