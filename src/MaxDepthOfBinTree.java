//LC #104
public class MaxDepthOfBinTree
{
    public static int maxDepth = 0;
    public static int maxDepth(BinaryTree root)
    {
        maxDep(root, maxDepth);
        return maxDepth;
    }

    public static void maxDep(BinaryTree root, int depth)
    {
        if(root == null)
        {
            maxDepth = Math.max(maxDepth, depth);
            return;
        }
        maxDep(root.left, depth + 1);
        maxDep(root.right, depth + 1);
    }
}
