import java.util.Arrays;

/**
 * Created by crtaylor123 on 11/27/16.
 */
public class URLify {
    public static String urlifyString(String a, int b){
        int index = 0;
        char[] charArray = new char[a.length()];

        for(int i = 0; index < b; i++){

            if(a.charAt(index) == ' '){
                charArray[i] = '%';
                i++;
                charArray[i] = '2';
                i++;
                charArray[i] = '0';
            }
            else charArray[i] = a.charAt(index);
            index++;

        }
        return new String(charArray);
    }
}

    public static String urlifySolution(char[], int b){
        char[] charArray = new char[a.length()];

        for(int i = a.length(); b > -1; i--){

            if(a.charAt(b) == ' '){
                charArray[i] = '0';
                i+;
                charArray[i] = '2';
                i++;
                charArray[i] = '%';
            }
            else charArray[i] = a.charAt(index);
            index++;

        }
        return new String(charArray);
    }
