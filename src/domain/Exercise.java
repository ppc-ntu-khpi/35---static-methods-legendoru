package domain;

/**
 * A class that represent the exercise
 * @author OLEX
 */
public class Exercise {
    
    /**
     * Converting dec six-digit number to binary, octtal and hex
     * @param number six-digit number
     * @return string with binary, octal and hex notation
     * @throws java.lang.Exception 
     */
    public static String Calculate(int number) throws Exception{
        
        String result = "";
        
        // check length of number
        int length = (int) (Math.log10(Math.abs(number)) + 1);
        if (length!=6)  throw new Exception("Number `" + String.valueOf(number) + "` is not six-digit");
        
        // to binary
        result += Integer.toBinaryString(number) + ", ";
        // to octal
        result += Integer.toOctalString(number) + ", ";
        // to hex
        result += Integer.toHexString(number);
        
        return result;
    }
}