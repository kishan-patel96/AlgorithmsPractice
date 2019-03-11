//LC #26
public class RemoveDuplicatesSortedArr
{
    //Preserves data
    public static int removeDuplicates(int[] nums)
    {
        int curr = 1;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[curr - 1] != nums[i])
            {
                nums[i] = nums[i] ^ nums[curr] ^ (nums[curr] = nums[i]);
                curr++;
            }
        }
        return curr;
    }

    //Takes advantage of sorted array
    public static int removeDuplicates2(int[] nums)
    {
        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums)
        {
            if (n > nums[i - 1])
            {
                nums[i++] = n;
            }
        }
        return i;
    }
}
