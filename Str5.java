
    

// importing Arrays to convert array to string
// used for printing arrays
import java.util.Arrays;
public class Str5 {


  public static void main(String[] args) {
    String vowels = "a+e+f";

    // splitting the string at "+"
    String[] result = vowels.split("\\+");


    // converting array to string and printing it
    System.out.println("result = " + Arrays.toString(result));
  }
}