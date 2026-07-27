class Solution {
    public int maxAbsoluteSum(int[] nums) {
        
        int maxSum = maxSubarray(nums);
        int minSum = minSubarray(nums);
        
        return Math.max(maxSum, Math.abs(minSum));
     
    }

    public int maxSubarray(int[] nums) {
        int currentSum = nums[0];
        int result = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            result = Math.max(result, currentSum);
        }
         
         return result;
    }

    public int minSubarray(int[] nums) {
        int currentSum = nums[0];
        int result = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            currentSum = Math.min(currentSum + nums[i], nums[i]);
            result = Math.min(result, currentSum);
        }

        return result;

    }
}