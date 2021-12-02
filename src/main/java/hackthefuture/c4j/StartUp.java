package hackthefuture.c4j;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;

public class StartUp {

    public static void main(String[] args) {
        new StartUp().run();
    }

    private void run() {
        Api test = new Api();
        HttpResponse<JsonNode> testData = test.GetSuspects();
        System.out.print(testData.getBody());
    }
}
