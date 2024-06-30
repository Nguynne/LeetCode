public class Solution
{
  public int FindDuplicate(int[] nums)
  {
    Array.Sort(nums); // Sort the array in ascending order

    for (int i = 0; i < nums.Length - 1; i++)
    {
      if (nums[i] == nums[i + 1])
      {
        return nums[i]; // Return the index of the duplicate
      }
    }

    return -1; // No duplicate found
  }
}