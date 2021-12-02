package hackthefuture.c4j.logic;

import java.util.Objects;

public class Investigation {

    private String id;
    private String investigation;
    private String investigationParameters;
    private String attemptsRemaining;
    private String outcome;

    public Investigation() {

    }

    public Investigation(String id, String investigation, String investigationParameters, String attemptsRemaining, String outcome) {
        this.id = id;
        this.investigation = investigation;
        this.investigationParameters = investigationParameters;
        this.attemptsRemaining = attemptsRemaining;
        this.outcome = outcome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInvestigation() {
        return investigation;
    }

    public void setInvestigation(String investigation) {
        this.investigation = investigation;
    }

    public String getInvestigationParameters() {
        return investigationParameters;
    }

    public void setInvestigationParameters(String investigationParameters) {
        this.investigationParameters = investigationParameters;
    }

    public String getAttemptsRemaining() {
        return attemptsRemaining;
    }

    public void setAttemptsRemaining(String attemptsRemaining) {
        this.attemptsRemaining = attemptsRemaining;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Investigation that = (Investigation) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Investigation{" +
                "id='" + id + '\'' +
                ", investigation='" + investigation + '\'' +
                ", investigationParameters='" + investigationParameters + '\'' +
                ", attemptsRemaining='" + attemptsRemaining + '\'' +
                ", outcome='" + outcome + '\'' +
                '}';
    }
}
