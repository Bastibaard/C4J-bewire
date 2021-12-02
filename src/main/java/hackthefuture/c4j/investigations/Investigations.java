package hackthefuture.c4j.investigations;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Set;
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
        return res.toString();
    }

    public static String ReverseString(String strToReverse){
        return new StringBuilder(strToReverse).reverse().toString();
    }

}
