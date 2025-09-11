public class SecLargestElement {
    // without sorting
    public static int secondLargestElement(int[] nums) {
        
        if(nums.length < 2) return 0;

        int first  = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : nums){
            if(num > first){
                second = first;
                first = num;                
            }else if( num > second && num != first){
                second = num;
            }
        }
        return (second != Integer.MIN_VALUE ? second :0);
    }

    public static void main(String[] args) {
        int arr[] = {8, 8, 7, 6, 5};
        System.out.println(secondLargestElement(arr));
    }
}
