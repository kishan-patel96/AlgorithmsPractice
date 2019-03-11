//LC #111
public class MinDepthOfBT
{
    //Overwrites value
    public static int minDepth(BinaryTree root)
    {
        return findMin(root);
    }

    public static int findMin(BinaryTree root)
    {
        if(root == null)
        {
            return 0;
        }
        root.val = 1;
        findMin(root.left);
        findMin(root.right);
        if(root.left != null || root.right != null)
        {
            root.val = Math.min(root.left != null ? root.left.val:Integer.MAX_VALUE-1, root.right != null ? root.right.val:Integer.MAX_VALUE-1) + 1;
        }
        return root.val;
    }

    //Clean solution
    public static int minDepth2(BinaryTree root)
    {
        if(root == null)
        {
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left == 0 || right == 0) ? left + right + 1: Math.min(left,right) + 1;

    }
}
