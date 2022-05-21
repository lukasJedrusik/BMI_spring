import java.lang.reflect.Array;
import java.util.Arrays;

public class DoubleCar {
    public static void main(String[] args) {
        System.out.println(doubleChar("autko"));
    }


    public static  String doubleChar(String str) {
        //char tab[] = str.toCharArray();
        String newString = "";
        for (int i = 0; i < str.length(); i++){
            newString =  newString + str.charAt(i) + str.charAt(i);

        }
        return newString;


    }
}

