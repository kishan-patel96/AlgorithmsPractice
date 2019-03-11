import java.util.*;

public class TwoSum
{
    public static int[] getTwoNums(int[] a, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < a.length; i++)
        {
            if(map.containsKey(a[i]))
            {
                return new int[]{a[map.get(a[i])], a[i]};
            }
            else
            {
                map.put(target - a[i], i);
            }
        }
        return null;
    }
}
