package hackthefuture.c4j;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import hackthefuture.c4j.investigations.Investigations;

public class StartUp {

    public static void main(String[] args) {
        new StartUp().run();
    }

    private void run() {
        Api test = new Api();
        HttpResponse<JsonNode> testData = test.GetSuspects();
        System.out.print(testData.getBody());
        System.out.println(Investigations.StringToHex("9Oqopcyl4RQa"));
        System.out.println(Investigations.Base64Decode("MVdNcmpYeFBqTlJyR2hJcklHSWttQTlhaXQzZHBmbHZEZUYzNmFrbGNxWg=="));
    }
}
