import java.util.*;

//LC 416
public class EqualSubsetSum
{
    public static int[] a;
    public static Set<Integer> memo;

    public static boolean canPartition(int[] nums)
    {
        int total = 0;
        memo = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            total += nums[i];
        }
        if(total % 2 == 1)
        {
            return false;
        }

        a = nums;
        return decision(0, 0, total/2);
    }

    public static boolean decision(int sum, int idx, int target)
    {
        //System.out.println(sum + "," + target);
        if(sum == target)
        {
            return true;
        }
        else if(sum > target || memo.contains(cantorPairing(sum, idx)) || idx == a.length)
        {
            memo.add(cantorPairing(sum, idx));
            return false;
        }
        else
        {
            memo.add(cantorPairing(sum, idx));
            return decision(sum + a[idx], idx + 1, target) || decision(sum, idx + 1, target);
        }
    }

    public static int cantorPairing(int n1, int n2)
    {
        return ((n1 + n2) * (n1 + n2 + 1)) / 2 + n2;
    }
}
