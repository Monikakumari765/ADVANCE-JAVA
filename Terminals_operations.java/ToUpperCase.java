public class ToUpperCase {
    public static void main(String[] args){
        String s = "Monika";
        // s = s.toUpperCase();
        String res = "";

        // System.out.println(s);

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                res = res + ch;
            }
            else {
                res = res + (char)(ch - 32);
            }
        }

        System.out.print(res);


        for(int i = 0 ; i <= 200 ; i++){
            System.out.println( i + " -> " + (char)(i));
        }

        System.out.print(22+ "" + (char)188);
    }
}