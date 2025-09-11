import java.util.Arrays;

public class LargestElement {
   public static int largestElement(int[] nums) {
      Arrays.sort(nums);
      return nums.length-1;
   }
   public static void main(String[] args) {
    int arr[] ={-4, -3, 0, 1, -8};
    System.out.println(largestElement(arr));
   } 
}
