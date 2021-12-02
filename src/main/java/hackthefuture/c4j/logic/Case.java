package hackthefuture.c4j.logic;

import java.util.List;
import java.util.Objects;

public class Case {

    private String id;
    private List<Investigation> investigations;

    public Case() {

    }

    public Case(String id, List<Investigation> investigations) {
        this.id = id;
        this.investigations = investigations;
    }

    public Investigation getInvestigationById(String id){
        for (Investigation inv : investigations){
            if (inv.getId().equals(id)){
                return inv;
            };
        }
        return null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Investigation> getInvestigations() {
        return investigations;
    }

    public void setInvestigations(List<Investigation> investigations) {
        this.investigations = investigations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Case aCase = (Case) o;
        return id.equals(aCase.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Case{" +
                "id='" + id + '\'' +
                ", investigations=" + investigations +
                '}';
    }
}
