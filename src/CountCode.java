public class CountCode {
    public static void main(String[] args) {
        System.out.println(countCode("acodebcodeccodercodecodeporcode"));
    }

    public static int countCode(String str) {
        int count = 0;
        //String sub = "";
        String pattern = "code";
        while (str.indexOf("code") != -1){
             {
                count++;
                str = str.substring(str.indexOf("code") + 4);
            }
        }

        return count;
    }

    /*public static String code (String str){
        if(str.charAt(0) == 'c' && str.charAt(1) == 'o' && str.charAt(3) == 'e'){
            return "Code";
        } else return "";
    } */
}
//
/*
Return the number of times that the string "code"
        appears anywhere in the given string,
        except we'll accept any letter for the 'd', so "cope" and "cooe" count.


        countCode("aaacodebbb") → 1
        countCode("codexxcode") → 2
        countCode("cozexxcope") → 2
*/
