//LC #100
public class SameTree
{
    public static boolean isSameTree(BinaryTree p, BinaryTree q) {
        if(p == null || q == null)
        {
            return p == q;
        }
        else if(p.val != q.val)
        {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
