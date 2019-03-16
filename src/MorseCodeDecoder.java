import java.util.Arrays;

public class MorseCodeDecoder {

    public static String findChildren(String text) {
        // TODO: Arraynge letter in alphabetical order Upper and lower case
            String[] sorted = text.split("");
            Arrays.sort(sorted);
            Arrays.sort(sorted,String.CASE_INSENSITIVE_ORDER);
            return String.join("",sorted);
    }
}
