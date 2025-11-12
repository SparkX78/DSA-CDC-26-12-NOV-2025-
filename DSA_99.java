public class DSA_99 {
    public static int maxSliding(int[] nums, int k){
        int window_sum = 0;
        int max_sum = 0;
        for(int i = 0; i < k; i++){
            window_sum += nums[i];
        }
        max_sum = window_sum;
        for(int i = k; i < nums.length; i++){
            window_sum += nums[i] - nums[i-k];
            max_sum = Math.max(max_sum, window_sum);
        }
        return max_sum;

    }
    public static void main(String[] args){
        int[] nums = {12, 10, -4, 23, -8, 32};
        int k = 2;
        System.out.println(maxSliding(nums, k));
    }
}
