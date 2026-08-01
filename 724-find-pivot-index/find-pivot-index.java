class Solution {
    public int pivotIndex(int[] nums) {
        
        int left = 0; 
        int sum = 0;
        //Total Sum
        for(int x : nums){
            sum = sum + x;
        }
        //check at index 0
        if(sum - nums[0] == 0){
            return 0;

        }
        for(int i = 1; i < nums.length; i++){
            left = left + nums[i-1];
            int right = sum - left - nums[i];
            if(left == right){
                return i;
            }
        }
        return -1;
    }
}