import java.util.*;

//LC #118
public class PascalsTriangle
{
    public static List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1; i <= numRows; i++)
        {
            List<Integer> l = new ArrayList<>();
            list.add(l);
            for(int j = 0; j < i; j++)
            {
                if(j != 0 && j != i - 1)
                {
                    l.add(list.get(i - 2).get(j - 1) + list.get(i - 2).get(j));
                }
                else
                {
                    l.add(1);
                }
            }
        }
        return list;
    }
}
