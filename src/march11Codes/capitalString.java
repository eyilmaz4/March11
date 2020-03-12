package march11Codes;

public class capitalString {
    public static void main(String[] args) {
        findCapital("Today We Will Repeat");
    }
    public static void findCapital(String sentence){
        int number=0;
        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i)>=65 &&sentence.charAt(i)<=90  ){
                number++;
            }
        }
        System.out.println(number);
    }
}
