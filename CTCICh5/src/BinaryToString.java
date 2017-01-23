/**
 * Created by crtaylor123 on 1/21/17.
 */
public class BinaryToString {

    /* Instructions
    Given a real number between 0 and 1 (e.g., 0.72) that is passed in as a double, print the binary representation.
    If the number cannot be represented accurately in binary with at most 32 characters, print "ERROR:'
     */

    /* Questions
        Since we are only doing numbers between 0 to 1, are we not doing a sign bit?
        Do I need to stop before 32 characters, or if it detects a repeating pattern?
     */

    /* Solution
        This helped. https://en.wikipedia.org/wiki/Binary_number#Decimal
     */



    static public String binaryConvert(double realNum){
        if(realNum >=1 || realNum <= 0){
            return "Error";
        }
        double result = realNum;
        String binaryResult = "0.";
        while(binaryResult.length() <= 32){
            result = result * 2;
            System.out.println(result);

            if(result > 1){

                result = result - 1.0;
                binaryResult = binaryResult + "1";
            }
            else{
                binaryResult = binaryResult + "0";
            }
            System.out.println(binaryResult);
        }

        return binaryResult;
    }
}
