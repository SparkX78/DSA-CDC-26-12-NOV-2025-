public class DSA_98 {
    public static int MaxSubarrayProduct(int[] nums){
        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];
        for(int i = 1; i < nums.length; i++){
            int tempMax = Math.max(nums[i], Math.max(maxProd*nums[i], minProd*nums[i]));
            int tempMin = Math.min(nums[i], Math.min(maxProd*nums[i], minProd*nums[i]));

            maxProd = tempMax;
            minProd = tempMin;

            result = Math.max(result, maxProd);

        }
        return result;
    }
    public static void main(String args[]){
        int[] nums = {12, 2, 0, -6};
        System.out.println(MaxSubarrayProduct(nums));
    }
}
