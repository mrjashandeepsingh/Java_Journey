import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int num[] = {3,5,7,9};
        int arr[] = new int[4];
        arr[0] = 12;
        arr[1] = 34;
        System.out.println(arr[1]);
        for (int i=0;i<4;i++) {
            System.out.println(num[i]);

        }   
        // Multi-Dimensional Arrays
        int[][] nums = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12}};
        // Printing the Multi-Dimensional Array
        for(int i=0;i<3;i++) {
            for(int j=0;j<4;j++) {
                System.out.print(nums[i][j]+" ");
            }System.out.println();
        }

        System.out.println(Arrays.toString(nums[0]));
        for (int n[] : nums){
            for( int m : n){
                System.out.print(m+" ");
            }System.out.println();
        }
    }
}       