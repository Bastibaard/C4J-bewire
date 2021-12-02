package hackthefuture.c4j.webapi;

import hackthefuture.c4j.logic.Case;
import hackthefuture.c4j.logic.CaseResult;
import hackthefuture.c4j.logic.Investigation;
import hackthefuture.c4j.logic.Suspects;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class Api {

    public Api() {
        Unirest.config().defaultBaseUrl("http://htf.bewire.org");
    }

    public HttpResponse<Suspects> GetSuspects() {
        return Unirest.get("/suspects")
                .header("accept", "application/json")
                .asObject(Suspects.class);
    }

    public HttpResponse<Case> GetCaseInvestigations(String caseId) {
        return Unirest.get("/case/{caseId}")
                .routeParam("caseId", caseId)
                .asObject(Case.class);
    }

    public HttpResponse<Investigation> SubmitInvestigation(String answer, String investigationId) {
        return Unirest.post("/investigation/{investigationId}")
                .queryString("answer", answer)
                .routeParam("investigationId", investigationId)
                .asObject(Investigation.class);
    }

    public HttpResponse<CaseResult> CloseCase(String caseId, String suspectId) {
        return Unirest.post("/case/{caseId}/close")
                .queryString("suspectId", suspectId)
                .routeParam("caseId", caseId)
                .asObject(CaseResult.class);
    }
}


