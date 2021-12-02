package hackthefuture.c4j;

import hackthefuture.c4j.webapi.Api;
import hackthefuture.c4j.webapi.Case;
import hackthefuture.c4j.webapi.Suspects;
import kong.unirest.HttpResponse;
import hackthefuture.c4j.investigations.Investigations;

public class StartUp {

    public static void main(String[] args) {
        new StartUp().run();
    }

    private void run() {
        Api testApi = new Api();
        HttpResponse<Suspects> suspects = testApi.GetSuspects();
        //HttpResponse<Case> caseInvestigations = testApi.GetCaseInvestigations("07fd951b-6ec3-430e-a596-02bf2a819c52");

        System.out.print(suspects.getBody().getSuspects());
        //System.out.println(caseInvestigations.getBody().getInvestigations().get(0).getId());
        System.out.println(Investigations.StringToHex("9Oqopcyl4RQa"));
        System.out.println(Investigations.Base64Decode("MVdNcmpYeFBqTlJyR2hJcklHSWttQTlhaXQzZHBmbHZEZUYzNmFrbGNxWg=="));
    }
}
