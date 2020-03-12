package march11Codes;
import newPack.methodCode;
public class methodTest {
    public static void main(String[] args) {
        divide(3,4,"add");
        methodCode.sum(1,2);
        methos.mul(3,4);
    }
    public static void divide(int a, int b, String calc){
        if(calc.equalsIgnoreCase("add")){
            int result=a+b;
            System.out.println(result);
        }
    }
}
