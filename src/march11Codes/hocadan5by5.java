package march11Codes;

public class hocadan5by5 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3, 6, 7}, {4, 5, 6, 6, 7}, {7, 8, 9, 7, 8}, {6, 4, 3, 5, 6}, {1, 2, 3, 4, 5}};

    for(int row[]:nums){
        System.out.println();
        for(int num:row){
            System.out.print("\t\t"+num);
        }

        findEdge(nums);
    }
    }

    public static void findEdge(int arr[][]){
        int [][] diffs=new int [arr.length][arr[0].length];
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr[i].length; j++){
                diffs[i][j]= Math.abs(arr[i][j]-arr[i][j-1]);
            }
        }
        for(int row[]:diffs){
            for(int num:row){
                System.out.print("\t\t"+num);
            }
        }
    }
}
