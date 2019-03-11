import java.util.*;

public class PrintTreeVertically
{
    private static Map<Integer, String> m;
    private static int leftBound;
    private static int rightBound;

    public static void printVertically(BinaryTree root)
    {
        m = new HashMap<>();
        fillTable(root, 0);

        for(int i = leftBound; i <= rightBound; i++)
        {
            System.out.println(m.get(i));
        }
    }

    private static void fillTable(BinaryTree root, int level)
    {
        if(root == null)
        {
            leftBound = Math.min(leftBound, level + 1);
            rightBound = Math.max(rightBound, level - 1);
            return;
        }
        else if(!m.containsKey(level))
        {
            m.put(level, root.val + " ");
        }
        else
        {
            m.put(level, m.get(level) + root.val + " ");
        }
        fillTable(root.left, level - 1);
        fillTable(root.right, level + 1);
    }
}
