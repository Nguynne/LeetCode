class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] nums3 = new int[nums.length];
        int count =0;
        if(nums.length==2)
        {
        nums3[0]=nums[0];
        nums3[1]=nums[1];
        }
        else{
            for(int i=0;i<nums.length/2;i++)
            {
                nums3[2*i]=nums[i];
            }

            for(int i=0;i<nums.length/2;i++)
            {
                nums3[2*i+1]=nums[i+n];
            }

        }
        return nums3;
        }
}

