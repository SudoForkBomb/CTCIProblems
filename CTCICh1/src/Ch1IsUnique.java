/**
 * Created by crtaylor123 on 11/27/16.
 */
public class Ch1IsUnique {
    public static Boolean isUnique(String z) {
        String x = z;
        char first;
        char pointer;
        Boolean match = false;
        String phrase;

        for (int y = 0; y < x.length(); y++) {
            first = x.charAt(y);
            for (int i = y + 1; i < x.length(); i++) {
                pointer = x.charAt(i);
                phrase = first + " compared to " + pointer;

                if (pointer == first) {
                    phrase = phrase + " : match";
                    match = true;
                }
                System.out.println(phrase);
            }

        }
        System.out.println(match);

        return match;
    }
}
