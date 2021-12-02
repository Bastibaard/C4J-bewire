package hackthefuture.c4j.logic;

import java.util.List;
import java.util.Objects;

public class Suspects {

    private List<Suspect> suspects;

    public Suspects() {

    }

    public Suspects(List<Suspect> suspects) {
        this.suspects = suspects;
    }

    public List<Suspect> getSuspects() {
        return suspects;
    }

    public void setSuspects(List<Suspect> suspects) {
        this.suspects = suspects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Suspects suspects1 = (Suspects) o;
        return suspects.equals(suspects1.suspects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suspects);
    }

    @Override
    public String toString() {
        return "Suspects{" +
                "suspects=" + suspects +
                '}';
    }
}
