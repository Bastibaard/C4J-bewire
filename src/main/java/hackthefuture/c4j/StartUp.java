package hackthefuture.c4j;

import hackthefuture.c4j.webapi.Api;
import hackthefuture.c4j.webapi.Case;
import hackthefuture.c4j.webapi.Suspects;
import kong.unirest.HttpResponse;
import hackthefuture.c4j.investigations.Investigations;
import kong.unirest.json.JSONObject;

public class StartUp {

    public static void main(String[] args) {
        new StartUp().run();
    }

    private void run() {
        Api testApi = new Api();

        //HttpResponse<Suspects> suspects = testApi.GetSuspects();
        //System.out.print(suspects.getBody().getSuspects());

        HttpResponse<Case> caseInvestigations = testApi.GetCaseInvestigations("07fd951b-6ec3-430e-a596-02bf2a819c52");
        System.out.println(caseInvestigations.getBody().getInvestigations().get(0).getId());

        JSONObject obj = new JSONObject(caseInvestigations.getBody().getInvestigationById("761da2b7-1ca7-4a96-ad02-ed874d892e52").getInvestigationParameters());
        System.out.println(Investigations.CheckDays(obj));

        /* System.out.println(Investigations.StringToHex("9Oqopcyl4RQa"));
        System.out.println(Investigations.Base64Decode("MVdNcmpYeFBqTlJyR2hJcklHSWttQTlhaXQzZHBmbHZEZUYzNmFrbGNxWg=="));
        System.out.println(Investigations.FindMissingNumbers(new int[] {0,1,2,3,13,21,34,55,89,144,233,377,610,987,2584,4181,0,1,1,3,8,13,21,34,55,144,377,610,987,1597,2584,4181,0,2,5,8,13,21,34,55,89,144,233,377,610,1597,4181,0,1,2,3,5,8,13,21,34,89,233,377,610,987,1597,4181,0,1,1,3,8,13,21,34,55,89,144,987,1597,2584,4181,0,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,4181,1,1,3,5,8,13,21,34,55,89,233,377,610,987,2584,4181,0,1,1,2,3,5,13,21,34,89,144,233,377,987,2584,4181,0,1,2,3,5,8,13,34,55,89,144,233,377,610,2584,4181,0,1,1,2,5,8,21,34,89,144,233,377,987,1597,2584,4181,0,1,1,3,5,13,21,55,89,144,610,987,1597,2584,4181,0,1,1,2,3,8,13,55,89,233,377,610,1597,2584,4181,0,1,1,2,3,5,13,21,34,55,89,610,987,1597,2584,4181,0,1,1,3,5,8,21,55,89,144,233,377,610,2584,4181,0,1,2,3,8,13,55,89,233,377,610,987,1597,2584,4181,0,1,2,3,5,13,21,55,89,144,233,377,987,1597,2584,4181,1,2,3,8,13,21,34,55,89,144,233,610,987,1597,2584,4181,0,1,2,5,13,21,34,55,144,233,377,610,987,1597,2584,4181,0,1,1,2,8,13,21,34,89,144,233,610,987,2584,4181,0,1,2,3,5,8,13,34,55,89,144,610,987,1597,2584,4181,0,1,1,2,5,8,13,21,34,55,89,144,377,987,1597,2584,4181,0,1,2,3,5,8,21,89,144,233,377,610,987,1597,4181,0,1,1,2,5,8,13,21,34,89,233,377,987,1597,2584,4181}));
        System.out.println(Investigations.ReverseString("Dw7mfcXT2BzlRWSlCCsPuSKIAbHcKX7MFO0WmLcSFewn5KcwPMOt4OngHAySEOfHXuWAA9FVJ0c1uubZe8EZkuzwNU7QgaKKkL8l2hjzrgGwxU5nfbgrAgrwH63IG"));
        System.out.println(Investigations.isAlphabetical("001244799AAACCEFHIIIJKMOPPPTTUUVWWXXYYYZZaabdefgijklmmnpprrrsuuvvwwxxyy"));
        */
    }
}
