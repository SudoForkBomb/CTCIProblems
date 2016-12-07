/**
 * Created by crtaylor123 on 11/27/16.
 */

/*
    After solution:
    So mine isn't exactly looking to see if two strings are permutations, but seeing if they aren't.
    If a string has two characters that are the same, then it could still fail, but because it always checks that the strings are the same length,
        and would return false if it found a character that didn't match, it still works.
 */
public class Ch1CheckPermutation {

    public static Boolean checkPermutation(String a, String b){

        if (a.length() != b.length())
            return false;

        boolean[] charArray = new boolean[128];
        for (int i = 0; i < a.length(); i++ ){
            int val = a.charAt(i);
            charArray[val]=true;
        }
        for (int i = 0; i < b.length(); i++ ){
            int val = b.charAt(i);
            if (!charArray[val]){
                return false;
            }
        }
        return true;
    }

    public static Boolean permutationSolution(String a, String b){

        if (a.length() != b.length())
            return false;

        int[] charArray = new int[128];
        for (int i = 0; i < a.length(); i++ ){
            int val = a.charAt(i);
            charArray[val]++;
        }
        for (int i = 0; i < b.length(); i++ ){
            int val = b.charAt(i);
            if (charArray[val] <= 0){
                return false;
            }
            charArray[val]--;
        }
        return true;
    }
}
