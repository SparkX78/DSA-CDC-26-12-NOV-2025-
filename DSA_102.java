public class DSA_102 {
    public static int variable_sliding(int[] nums, int target){
        int left = 0; 
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        for(int right = 0; right < nums.length; right++ ){
            sum += nums[right];
            while(sum >= target){
                minLength = Math.min(minLength, right-left+1);
                sum -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE? 0: minLength;

    }
    public static void main(String[] args){
        int[] nums = {12, 1, 3, 8};
        int target = 13;
        System.out.println(variable_sliding(nums, target));
    }
}
