import java.util.*;

//LC #107
public class BinTreeLvlOrdTrav2
{
    public static Map<Integer, List<Integer>> m;
    public static int maxDepth = 1;

    public static List<List<Integer>> levelOrderBottom(BinaryTree root) {
        m = new HashMap<>();
        List<List<Integer>> output = new ArrayList<>();

        fillMap(root, maxDepth);

        while(m.get(maxDepth) != null && maxDepth > 0)
        {
            output.add(m.get(maxDepth--));
        }
        return output;
    }

    public static void fillMap(BinaryTree root, int depth)
    {
        if(root == null)
        {
            maxDepth = Math.max(maxDepth, depth - 1);
            return;
        }
        else if(!m.containsKey(depth))
        {
            List<Integer> l = new ArrayList<>();
            l.add(root.val);
            m.put(depth, l);
        }
        else
        {
            m.get(depth).add(root.val);
        }
        fillMap(root.left, depth + 1);
        fillMap(root.right, depth + 1);
    }
}
