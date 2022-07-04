public class WithoutString {
    public static void main(String[] args) {
        System.out.println(withoutString("mKjtMkx","Mk"));
    }

    public static String withoutString(String base, String remove) {
        //String newBase = base.toUpperCase();
        // String newRemove = remove.toUpperCase();

    String temp = "";
        temp = base.replace(remove.toUpperCase(), "");
        temp = temp.replace(remove.toLowerCase(), "");
        temp =  temp.replace(remove, "");
        return temp ;

    }
}
