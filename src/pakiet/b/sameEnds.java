package pakiet.b;

public class sameEnds {
    public static void main(String[] args) {
        System.out.println(sameEnds("mymmynmym"));
    }
    public static String sameEnds(String string) {
        int end = string.length();
        String newString = "";
        int h = 0;
        int i;
        int index = 0;
        for(i = 1; i < end; i++){
            if(string.charAt(h) == string.charAt(i)){
                index = string.lastIndexOf(string.charAt(i));
               // newString = newString + string.charAt(i);
                //h++;
                break;
            } else {
                index = end - 1;
            }
        }
        for( i = index;i < end; i++){
            if(string.charAt(h) == string.charAt(i)){
                 newString = newString + string.charAt(i);
                 h++;
            } else {
                newString ="";
                break;
            }
        }
        return newString;

    }
}
