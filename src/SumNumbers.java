public class SumNumbers {
    public static void main(String[] args) {
        System.out.println(sumNumbers("abc112h3fe"));
    }
    public static int sumNumbers(String str) {
        int score = 0;
        String str2 = "";

        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                str2 = str2 + str.charAt(i);
            } else str2 = str2 + " ";
        }

        String[] tab = str2.split(" ");

        for(int i = 0; i < tab.length; i++){
            if(!tab[i].equals(""))
            {
            int j = Integer.parseInt(tab[i]);
            score = score + j ;
            }
        }
        // for(String s : tab){
        //  score += Integer.parseInt(s);
        // }

        return score;


    }
}

