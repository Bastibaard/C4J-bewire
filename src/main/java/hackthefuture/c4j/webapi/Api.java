package hackthefuture.c4j.webapi;

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
}


