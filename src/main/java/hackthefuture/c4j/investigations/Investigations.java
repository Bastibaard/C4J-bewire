package hackthefuture.c4j.investigations;

import org.apache.commons.codec.binary.Hex;;import java.nio.charset.StandardCharsets;
import java.util.Locale;

public abstract class Investigations {

    public static String StringToHex(String input){
        String id = "83d83ee8-c71f-4d2b-aad8-35b231495b18";
        String hexedInput = Hex.encodeHexString(input.getBytes(StandardCharsets.UTF_8));
        // Zoekt naar 2 opeenvolgende karakters en vervangt deze door dezelfde karakters, maar gevolgd door een spatie
        String res = hexedInput.replaceAll("..", "$0 ").toUpperCase();
        // Echter laatste spatie moet nog verwijderd worden (not sure of het anders als fout zou aangeduid worden
        // Geeft normaal string "39 4F 71 6F 70 63 79 6C 34 52 51 61" terug
        return res.substring(0,res.length()-1);
    }

}
