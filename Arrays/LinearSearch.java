public class LinearSearch {
    static int linearSearch(int nums[], int k){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,24,1,6,9};
        int toFind = 24;
        System.out.println(linearSearch(arr,toFind));
    }
}
