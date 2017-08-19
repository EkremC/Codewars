package _8KYU;

import java.util.HashMap;

/**
 * Created by ekremcandemir on 11/07/2017.
 */
// https://www.codewars.com/kata/welcome/train/java
public class Welcome {

    private static HashMap<String, String> welcomes = new HashMap<>();

    static {

        welcomes.put("english", "Welcome");
        welcomes.put("czech", "Vitejte");
        welcomes.put("danish", "Velkomst");
        welcomes.put("dutch", "Welkom");
        welcomes.put("estonian", "Tere tulemast");
        welcomes.put("finnish", "Tervetuloa");
        welcomes.put("flemish", "Welgekomen");
        welcomes.put("french", "Bienvenue");
        welcomes.put("german", "Willkommen");
        welcomes.put("irish", "Failte");
        welcomes.put("italian", "Benvenuto");
        welcomes.put("latvian", "Gaidits");
        welcomes.put("lithuanian", "Laukiamas");
        welcomes.put("polish", "Witamy");
        welcomes.put("spanish", "Bienvenido");
        welcomes.put("swedish", "Valkommen");
        welcomes.put("welsh", "Croeso");
        welcomes.put("IP_ADDRESS_INVALID", "Welcome");
        welcomes.put("IP_ADDRESS_NOT_FOUND", "Welcome");
        welcomes.put("IP_ADDRESS_REQUIRED", "Welcome");

    }

    public static String greet(String language) {
        return welcomes.get(language);
    }

}
