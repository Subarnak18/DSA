class Solution {

    public int maxSubarraySumCircular(int[] nums) {

        int total = 0;

        for (int num : nums) {
            total += num;
        }

        int maxSum = maxSubarray(nums);
        int minSum = minSubarray(nums);

        // All elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, total - minSum);
    }

    // LeetCode 53
    public int maxSubarray(int[] nums) {

        int current = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            current = Math.max(current + nums[i], nums[i]);

            result = Math.max(result, current);
        }

        return result;
    }

    // Minimum Kadane
    public int minSubarray(int[] nums) {

        int current = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            current = Math.min(current + nums[i], nums[i]);

            result = Math.min(result, current);
        }

        return result;
    }
}