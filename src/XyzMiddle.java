public class XyzMiddle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("xyzxyzxyzBxyzxyz"));
    }


    public static boolean xyzMiddle(String str) {
        int index = str.length()/2 - 1;
        int indexBegin = str.indexOf("xyz", index- 1);
        int indexEnd = indexBegin + 3;
        boolean result = false;
        String left = "" ;
        String right = "" ;


        if(str.lastIndexOf("xyz") != -1) {
            if (str.length() >= 3 && indexBegin > 0) {
                left = str.substring(0, indexBegin);
                right = str.substring(indexEnd);
            } /*else if (str.length() >= 3) {
                left = str.substring(0, str.indexOf("xyz"));
                right = str.substring(str.indexOf("xyz") + 3);
            }*/

            if (left.length() == right.length() || left.length() - right.length() == 1
                    || right.length() - left.length() == 1) {
                result = true;
            }
        }

        return result;
    }

}
