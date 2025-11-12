public class DSA_100 {
    public static int BruteForceSliding(int[] nums, int k){
        int max_sum = Integer.MIN_VALUE;
        
        for(int i = 0; i< nums.length-k; i++){
            int cur_sum = 0;
            for(int j = i; j < i+k; j++){
                cur_sum += nums[j];
                
            }
            max_sum = Math.max(max_sum, cur_sum);

        }
        return max_sum;
    }
    public static void main(String[] args){
        int[] nums = {12, -2, 23, 8, -12};
        int k = 2;
        System.out.println(BruteForceSliding(nums, k));
    }
}
