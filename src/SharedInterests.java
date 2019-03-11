import java.util.HashSet;
import java.util.*;

public class SharedInterests
{
    public static int maxShared(int numNodes, int numEdges, int[] from, int[] to, int[] weights)
    {
        Map<Integer, Set<Integer>> m = new HashMap<>();
        for(int i = 0; i < from.length; i++)
        {
            if(!m.containsKey(from[i]))
            {
                Set<Integer> s = new HashSet<>();
                s.add(weights[i]);
                m.put(from[i], s);
            }
            else
            {
                m.get(from[i]).add(weights[i]);
            }
            if(!m.containsKey(to[i]))
            {
                Set<Integer> s = new HashSet<>();
                s.add(weights[i]);
                m.put(to[i], s);
            }
            else
            {
                m.get(to[i]).add(weights[i]);
            }
        }

        int maxPairProd = 0;
        int maxInterests = 0;
        for(int i = 1; i < numNodes; i++)
        {
            Set<Integer> s = m.get(i);
            for(int j = i + 1; j <= numNodes; j++)
            {
                Set<Integer> s2 = m.get(j);
                int maxInt = 0;
                for(int val : s)
                {
                    if(s2.contains(val))
                    {
                        maxInt++;
                    }
                    if(maxInt > maxInterests)
                    {
                        maxInterests = maxInt;
                        maxPairProd = i * j;
                    }
                    else if(maxInt == maxInterests)
                    {
                        maxPairProd = Math.max(maxPairProd, i * j);
                    }
                }
            }
        }
        return maxPairProd;
    }
}
