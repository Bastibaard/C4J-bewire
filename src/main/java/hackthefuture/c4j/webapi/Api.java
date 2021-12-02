package hackthefuture.c4j.webapi;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.ObjectMapper;
import kong.unirest.Unirest;

public class Api {

    public Api() {
        Unirest.config().defaultBaseUrl("http://htf.bewire.org");
    }

    public HttpResponse<JsonNode> GetSuspects() {
        return Unirest.get("/suspects")
                .asJson();
    }

    public HttpResponse<Case> GetCaseInvestigations(String caseId) {
        return Unirest.get("/case/{caseId}")
                .routeParam("caseId", caseId)
                .asObject(Case.class);
    }
}


