package hackthefuture.c4j.investigations;

import kong.unirest.json.JSONObject;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import java.nio.charset.StandardCharsets;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.*;
import java.util.stream.Collectors;

public abstract class Investigations {

    public static String StringToHex(String input){
        // id = 83d83ee8-c71f-4d2b-aad8-35b231495b18
        String hexedInput = Hex.encodeHexString(input.getBytes(StandardCharsets.UTF_8));
        // Zoekt naar 2 opeenvolgende karakters en vervangt deze door dezelfde karakters, maar gevolgd door een spatie
        String res = hexedInput.replaceAll("..", "$0 ").toUpperCase();
        // Echter laatste spatie moet nog verwijderd worden (not sure of het anders als fout zou aangeduid worden
        return res.substring(0,res.length()-1);
    }

    public static String Base64Decode(String input){
        //id = 098fbde5-ffa2-4e60-a218-c7d6b325a531
        byte[] base64decoded = Base64.decodeBase64(input);
        return new String(base64decoded, StandardCharsets.UTF_8);
    }

    public static String FindMissingNumbers(int[] array){
        Set<Integer> temp = Arrays.stream(array).boxed().collect(Collectors.toSet());
        StringBuilder res = new StringBuilder("");

        for (int i = 0; i < 4181 ; i++) {
            if (!temp.contains(i)){
                res.append(i).append(",");
            }
        }
        return res.substring(0,res.length()-1);
    }

    public static String ReverseString(String strToReverse){
        return new StringBuilder(strToReverse).reverse().toString();
    }

    public static String isAlphabetical(String input){
        //ascii waarden van getallen < hoofdletters < kleine letters dus de volgorde kan kloppen opt eerste zicht al kloppen.
        int arrLength = input.length();

        //Character array maken op basis van de input
        char[] charArray = new char[arrLength];
        for (int i = 0; i < arrLength; i++) {
            charArray[i] = input.charAt(i);
        }
        //character array sorteren en dan vergelijken met het originele woord
        //als de volledige array / woord gelijk zijn aan elkaar staat het woord op alfabetische volgorde
        Arrays.sort(charArray);
        for (int i = 0; i < arrLength; i++)
            if (charArray[i] != input.charAt(i))
                return "N";

        return "Y";
    }

    public static String CheckDays(JSONObject date){
        int month = Integer.parseInt(String.valueOf(date.get("month")));
        int year = Integer.parseInt(String.valueOf(date.get("year")));

        YearMonth ym = YearMonth.of(year, month);

        String firstDay = ym.atDay(1).getDayOfWeek().name();
        String lastDay = ym.atEndOfMonth().getDayOfWeek().name();

        return firstDay+"-"+lastDay;
    }

}
