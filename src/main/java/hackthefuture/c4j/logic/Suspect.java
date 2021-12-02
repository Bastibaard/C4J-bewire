package hackthefuture.c4j.logic;

import java.util.Objects;

public class Suspect {
    private String id;
    private String name;

    public Suspect() {

    }

    public Suspect(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Suspect suspect = (Suspect) o;
        return id.equals(suspect.id) &&
                Objects.equals(name, suspect.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Suspect{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
