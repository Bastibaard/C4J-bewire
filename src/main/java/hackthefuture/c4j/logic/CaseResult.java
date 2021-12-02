package hackthefuture.c4j.logic;

public class CaseResult {

    private Suspect accusedSuspect;
    private Suspect murderer;
    private String result;

    public CaseResult() {

    }

    public CaseResult(Suspect accusedSuspect, Suspect murderer, String result) {
        this.accusedSuspect = accusedSuspect;
        this.murderer = murderer;
        this.result = result;
    }
}
