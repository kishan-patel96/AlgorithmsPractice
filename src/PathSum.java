//LC #112
public class PathSum
{
    public static boolean hasPathSum(BinaryTree root, int sum) {
        if(root == null)
        {
            return false;
        }
        sum -= root.val;
        if(hasPathSum(root.left, sum) || hasPathSum(root.right, sum))
        {
            return true;
        }
        return sum == 0 && root.left == root.right ? true:false;
    }
}
