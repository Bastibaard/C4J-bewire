package hackthefuture.c4j;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class Api {

    public Api() {
        Unirest.config().defaultBaseUrl("http://htf.bewire.org");
    }

    public HttpResponse<JsonNode> GetSuspects() {
        return Unirest.get("/suspects")
                .asJson();
    }

}


