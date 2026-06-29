class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Create a HashMap
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // Find the complement
            int complement = target - nums[i];

            // Check if complement exists
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store current number and its index
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}