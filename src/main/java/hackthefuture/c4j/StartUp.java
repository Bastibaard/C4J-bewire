package hackthefuture.c4j;

import hackthefuture.c4j.webapi.Api;
import hackthefuture.c4j.webapi.Case;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import hackthefuture.c4j.investigations.Investigations;

public class StartUp {

    public static void main(String[] args) {
        new StartUp().run();
    }

    private void run() {
        Api testApi = new Api();
        //HttpResponse<JsonNode> suspects = testApi.GetSuspects();
        HttpResponse<Case> caseInvestigations = testApi.GetCaseInvestigations("07fd951b-6ec3-430e-a596-02bf2a819c52");
        //System.out.print(suspects.getBody());
        System.out.println(caseInvestigations.getBody().getInvestigations().get(0).getId());

        /*System.out.println(Investigations.StringToHex("9Oqopcyl4RQa"));
        System.out.println(Investigations.Base64Decode("MVdNcmpYeFBqTlJyR2hJcklHSWttQTlhaXQzZHBmbHZEZUYzNmFrbGNxWg=="));
        System.out.println(Investigations.FindMissingNumbers(new int[] {0,1,2,3,13,21,34,55,89,144,233,377,610,987,2584,4181,0,1,1,3,8,13,21,34,55,144,377,610,987,1597,2584,4181,0,2,5,8,13,21,34,55,89,144,233,377,610,1597,4181,0,1,2,3,5,8,13,21,34,89,233,377,610,987,1597,4181,0,1,1,3,8,13,21,34,55,89,144,987,1597,2584,4181,0,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,4181,1,1,3,5,8,13,21,34,55,89,233,377,610,987,2584,4181,0,1,1,2,3,5,13,21,34,89,144,233,377,987,2584,4181,0,1,2,3,5,8,13,34,55,89,144,233,377,610,2584,4181,0,1,1,2,5,8,21,34,89,144,233,377,987,1597,2584,4181,0,1,1,3,5,13,21,55,89,144,610,987,1597,2584,4181,0,1,1,2,3,8,13,55,89,233,377,610,1597,2584,4181,0,1,1,2,3,5,13,21,34,55,89,610,987,1597,2584,4181,0,1,1,3,5,8,21,55,89,144,233,377,610,2584,4181,0,1,2,3,8,13,55,89,233,377,610,987,1597,2584,4181,0,1,2,3,5,13,21,55,89,144,233,377,987,1597,2584,4181,1,2,3,8,13,21,34,55,89,144,233,610,987,1597,2584,4181,0,1,2,5,13,21,34,55,144,233,377,610,987,1597,2584,4181,0,1,1,2,8,13,21,34,89,144,233,610,987,2584,4181,0,1,2,3,5,8,13,34,55,89,144,610,987,1597,2584,4181,0,1,1,2,5,8,13,21,34,55,89,144,377,987,1597,2584,4181,0,1,2,3,5,8,21,89,144,233,377,610,987,1597,4181,0,1,1,2,5,8,13,21,34,89,233,377,987,1597,2584,4181}));
        */
        
    }
}
