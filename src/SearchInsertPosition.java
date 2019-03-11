//LC #35
public class SearchInsertPosition
{
    public static int searchInsert(int[] nums, int target)
    {
        return binSearchRec(nums, target, 0, nums.length-1);
    }

    public static int binSearchRec(int[] nums, int target, int left, int right)
    {
        if(left > right)
        {
            return (left + right + 1)/2;
        }
        else if(target == nums[(left + right)/2])
        {
            return (left + right)/2;
        }
        else if(target > nums[(left + right)/2])
        {
            return binSearchRec(nums, target, (left + right)/2 + 1, right);
        }
        else
        {
            return binSearchRec(nums, target, left, (left + right)/2 - 1);
        }
    }

    public static int binSearch(int[] nums, int target)
    {
        int left = 0, right = nums.length - 1;
        while(right >= left)
        {
            if(target == nums[(left + right)/2])
            {
                return (left + right)/2;
            }
            else if(target > nums[((left + right)/2)])
            {
                left = (left + right)/2 + 1;
            }
            else
            {
                right = (left + right)/2 - 1;
            }
        }
        return (left + right + 1)/2;
    }
}
