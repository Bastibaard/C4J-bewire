package hackthefuture.c4j.webapi;

import hackthefuture.c4j.logic.Investigation;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class Api {

    public Api() {
        Unirest.config().defaultBaseUrl("http://htf.bewire.org");
    }

    public HttpResponse<Suspects> GetSuspects() {
        return Unirest.get("/suspects")
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
}


