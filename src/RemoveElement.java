//LC #27
public class RemoveElement
{
    //This preserves data integrity
    public static int removeElement(int[] nums, int val)
    {
        Integer curr = null;
        for(int i = 0; i < nums.length; i++)
        {
            if(curr != null)
            {
                if(nums[i] != val)
                {
                    nums[curr] = nums[curr] ^ nums[i] ^ (nums[i] = nums[curr]);
                    curr++;
                }
            }
            else if(nums[i] == val)
            {
                curr = i;
            }
        }
        return (curr == null) ? nums.length:curr;
    }

    //This looks much cleaner!
    public static int removeElement2(int[] nums, int val)
    {
        int curr = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != val)
            {
                nums[curr++] = nums[i];
            }
        }
        return curr;
    }
}
