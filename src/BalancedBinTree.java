//LC #110
public class BalancedBinTree
{
    //This overwrites value!
    public static boolean isBalanced(BinaryTree root)
    {
        if(root == null)
        {
            return true;
        }
        root.val = 0;
        if(!(isBalanced(root.left) && isBalanced(root.right)))
        {
            return false;
        }
        root.val = Math.max(root.left != null ? root.left.val:0, root.right != null ? root.right.val:0) + 1;
        return Math.abs((root.left != null ? root.left.val:0) - (root.right != null ? root.right.val:0)) <= 1;
    }

    //Cleaner
    public static boolean isBalanced2(BinaryTree root)
    {
        return getDepths(root) == -1 ? false:true;
    }

    public static int getDepths(BinaryTree root)
    {
        if(root == null)
        {
            return 0;
        }
        int left = getDepths(root.left);
        int right = getDepths(root.right);
        if(left == -1 || right == -1 || Math.abs(left - right) > 1)
        {
            return -1;
        }
        return ((left == 0 || right == 0) ? left + right:Math.max(left, right)) + 1;
    }
}
