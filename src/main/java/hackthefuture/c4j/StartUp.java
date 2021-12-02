package hackthefuture.c4j;

import hackthefuture.c4j.logic.Investigation;
import hackthefuture.c4j.webapi.Api;
import hackthefuture.c4j.logic.Case;
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

        HttpResponse<Case> caseInvestigations = testApi.GetCaseInvestigations("07fd951b-6ec3-430e-a596-02bf2a819c52");

        // Oplossen

        String strToHex = caseInvestigations.getBody().getInvestigationById("83d83ee8-c71f-4d2b-aad8-35b231495b18").getInvestigationParameters();
        String base64 = caseInvestigations.getBody().getInvestigationById("098fbde5-ffa2-4e60-a218-c7d6b325a531").getInvestigationParameters();
        String fibonacci = caseInvestigations.getBody().getInvestigationById("c0613a4e-8f5d-4a17-9ff6-7fd961ef4f59").getInvestigationParameters();
        String reverseThis = caseInvestigations.getBody().getInvestigationById("7c53a11c-bd65-4bfd-95e1-fa5eee4bff43").getInvestigationParameters();
        JSONObject dateStuff = new JSONObject(caseInvestigations.getBody().getInvestigationById("761da2b7-1ca7-4a96-ad02-ed874d892e52").getInvestigationParameters());
        String alphabet = caseInvestigations.getBody().getInvestigationById("5e5903fa-912d-498a-b22c-55755bdb8dc0").getInvestigationParameters();

        System.out.println(Investigations.StringToHex(strToHex));
        System.out.println(Investigations.Base64Decode(base64));
        //Investigations.FindMissingNumbers(fibonacci); //this one will not work -> opdracht verkeerd begrepen
        System.out.println(Investigations.ReverseString(reverseThis));
        System.out.println(Investigations.CheckDays(dateStuff));
        System.out.println(Investigations.isAlphabetical(alphabet));

        HttpResponse<Investigation> stringToHexFeedback = testApi.SubmitInvestigation(Investigations.StringToHex(strToHex), "83d83ee8-c71f-4d2b-aad8-35b231495b18");
        System.out.println(stringToHexFeedback.getBody());
        HttpResponse<Investigation> base64decode = testApi.SubmitInvestigation(Investigations.Base64Decode(base64), "098fbde5-ffa2-4e60-a218-c7d6b325a531");
        System.out.println(base64decode.getBody());
        HttpResponse<Investigation> reverseThisString = testApi.SubmitInvestigation(Investigations.ReverseString(reverseThis), "7c53a11c-bd65-4bfd-95e1-fa5eee4bff43");
        System.out.println(reverseThisString.getBody());
        HttpResponse<Investigation> guessTheDate = testApi.SubmitInvestigation(Investigations.CheckDays(dateStuff), "761da2b7-1ca7-4a96-ad02-ed874d892e52");
        System.out.println(guessTheDate.getBody());
        HttpResponse<Investigation> isThisAlphabetical = testApi.SubmitInvestigation(Investigations.isAlphabetical(alphabet), "5e5903fa-912d-498a-b22c-55755bdb8dc0");
        System.out.println(isThisAlphabetical.getBody());

    }
}
