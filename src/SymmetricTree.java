//LC #101
public class SymmetricTree
{
    public static boolean isSymmetric(BinaryTree root)
    {
        return isSym(root, root);
    }

    public static boolean isSym(BinaryTree root1, BinaryTree root2)
    {
        if(root1 == null || root2 == null)
        {
            return root1 == root2;
        }
        else if(root1.val != root2.val)
        {
            return false;
        }
        return isSym(root1.left, root2.right) && isSym(root1.right, root2.left);
    }
}
