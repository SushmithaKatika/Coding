public class BubbleSort {
    private static void bubble_sort(int nums[],int n){
        for(int i = 0; i < n-1;i ++){
            for(int j = 0;j < n-i-1;j++ ){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for (int k : nums) {
            System.out.print(k+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        int n = arr.length;
        bubble_sort(arr, n);
    }
}
