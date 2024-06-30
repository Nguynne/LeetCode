public class Solution {
    public int FindPeakElement(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.Length; i++){
            if (max < nums[i])
                max = nums[i];
        }
        
        for (int i = 0; i < nums.Length; i++){
            if (nums[i] == max)
                return i;
        }
        return -1;
    }
}