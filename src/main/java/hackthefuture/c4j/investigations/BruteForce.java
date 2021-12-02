package hackthefuture.c4j.investigations;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BruteForce {

    private static final Logger LOGGER = Logger.getLogger(BruteForce.class.getName());

    public void bruteforce() throws FileNotFoundException {
        String filename = "";
        try (Scanner in = new Scanner(new FileInputStream(filename))){

            while(in.hasNextLine()){
                // code om met de API te babbelen
                // post naar investigation/e962d565-01bc-4722-b2f6-f3a8c8465e41
                System.out.println(in.nextLine());
            }

        } catch (FileNotFoundException ex){
            LOGGER.log(Level.WARNING, "Wordlist niet gevonden", ex);
            throw new FileNotFoundException("File was not found");
        }
    }

}
