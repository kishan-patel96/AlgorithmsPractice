//LC #108
public class SortedArrToBST
{
    public static BinaryTree sortedArrayToBST(int[] nums)
    {
        return toBST(nums, 0, nums.length - 1);
    }

    public static BinaryTree toBST(int[] nums, int left, int right)
    {
        if(left > right)
        {
            return null;
        }
        int mid = (left + right) / 2;
        BinaryTree n = new BinaryTree(nums[mid]);
        if(left != right)
        {
            n.left = toBST(nums, left, mid - 1);
            n.right = toBST(nums, mid + 1, right);
        }
        return n;
    }
}
