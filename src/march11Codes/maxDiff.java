package march11Codes;

public class maxDiff {
    public static void main(String[] args) {
        int [] arr={4,5,8,12,15,13,18,27,3};
        printMaxDiff(arr);
    }
    public static void printMaxDiff(int [] arr){
        int diffs[]=new int [arr.length];
        for(int i=1; i<arr.length; i++){
            diffs[i]=Math.abs(arr[i]-arr[i-1]);
        }
        //now its time to find the max value of 1 dimansioanl arrray
int max=diffs[0];
        int i=0;
        int index=0;
        for(int number:diffs){
            if(number>max){
                max=number;
              index=i;
            }
            i++;
        }
        System.out.println("max difference:"+max+" "+"and indexes are:"+index+" "+(index+1));
    }
}
