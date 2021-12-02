package hackthefuture.c4j;

import hackthefuture.c4j.logic.Investigation;
import hackthefuture.c4j.webapi.Api;
import hackthefuture.c4j.webapi.Case;
import kong.unirest.HttpResponse;
import hackthefuture.c4j.investigations.Investigations;
import kong.unirest.json.JSONObject;
import java.util.concurrent.ExecutionException;

public class StartUp {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new StartUp().run();
    }

    private void run() throws ExecutionException, InterruptedException {
        Api testApi = new Api();

        HttpResponse<Investigation> investigationFeedback = testApi.SubmitInvestigation("zbsqabqjiu", "80e12000-b972-4ce1-8a97-e7a9d25df207");
        System.out.println(investigationFeedback.getBody());

        HttpResponse<Case> caseInvestigations = testApi.GetCaseInvestigations("07fd951b-6ec3-430e-a596-02bf2a819c52");
        System.out.println(caseInvestigations.getBody().getInvestigations().get(0).getId());

        // Oplossen

        String strToHex = caseInvestigations.getBody().getInvestigationById("83d83ee8-c71f-4d2b-aad8-35b231495b18").getInvestigationParameters();
        String base64 = caseInvestigations.getBody().getInvestigationById("098fbde5-ffa2-4e60-a218-c7d6b325a531").getInvestigationParameters();
        String fibonacci = caseInvestigations.getBody().getInvestigationById("c0613a4e-8f5d-4a17-9ff6-7fd961ef4f59").getInvestigationParameters();
        String reverseThis = caseInvestigations.getBody().getInvestigationById("7c53a11c-bd65-4bfd-95e1-fa5eee4bff43").getInvestigationParameters();
        JSONObject dateStuff = new JSONObject(caseInvestigations.getBody().getInvestigationById("761da2b7-1ca7-4a96-ad02-ed874d892e52").getInvestigationParameters());
        String alphabet = caseInvestigations.getBody().getInvestigationById("5e5903fa-912d-498a-b22c-55755bdb8dc0").getInvestigationParameters();

        Investigations.StringToHex(strToHex);
        Investigations.Base64Decode(base64);
        //Investigations.FindMissingNumbers(fibonacci); //this one will not work -> opdracht verkeerd begrepen
        Investigations.ReverseString(reverseThis);
        Investigations.CheckDays(dateStuff);
        Investigations.isAlphabetical(alphabet);



    }
}
