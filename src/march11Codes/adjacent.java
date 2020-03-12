package march11Codes;

public class adjacent {
    public static void main(String[] args) {
        int [] arr={4,5,8,12,15,13,18,27,3};
        printMaxDiff(arr);
    }
    public static void printMaxDiff(int [] arr){

        int max=0;
        for(int i=arr.length-2; i>=0; i--){
            if((arr[i+1]-arr[i])>max){
                max=Math.abs(arr[i+1]-arr[i]);
            }
        }
        System.out.println(max);
    }
}
