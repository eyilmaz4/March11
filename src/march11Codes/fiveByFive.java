package march11Codes;

public class fiveByFive {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3, 6, 7}, {4, 5, 6, 6, 7}, {7, 8, 9, 7, 8}, {6, 4, 3, 5, 6}, {1, 2, 3, 4, 5}};
                findEdges(nums);
    }
        public static void findEdges(int[][]arr){
            int[] max = new int[arr.length];
            for (int i = 1; i < arr.length; i++) {
                for (int j = 1; j < arr.length; j++) {
                    max[j] = Math.abs(arr[i][j] - arr[i][j - 1]);
                }
            }
            for (int num : max) {
                System.out.print(num);

            }
        }
    }

