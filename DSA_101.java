public class DSA_101 {
    public static int MinWindow_Length(int[] nums, int target){
        int minLength = Integer.MAX_VALUE;
        
        for(int start = 0; start < nums.length; start++ ){
            int sum = 0;
            for(int end = start; end < nums.length; end++){
                sum += nums[end];
                if(sum >= target){
                    minLength = Math.min(minLength, end-start+1);
                    break;
                }
            }
        }
        return minLength;
    }
    public static void main(String[] args){
        int[] nums = {2, 5, -3, 8};
        int target = 10;
        System.out.println(MinWindow_Length(nums, target));

    }
}
