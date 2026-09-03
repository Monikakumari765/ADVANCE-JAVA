public class SearchMonika {
    public static void main(String[] args){
        String[] studs = {"Kri","Shi","Pra","Moni","Sat","Soha","Grv"};

        for(int i = 0 ; i < studs.length; i++){
            if(studs[i] == "Moni") {
                System.out.print("Monika ka index hai  " + i);
                return;
            }
        }
    }
}
