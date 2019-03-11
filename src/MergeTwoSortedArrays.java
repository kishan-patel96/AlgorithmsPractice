import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrays
{
    public static List<int[]> merge(int[] ar1, int[] ar2)
    {
        List<int[]> arrays = new ArrayList<>();
        arrays.add(ar1);
        arrays.add(ar2);

        for(int i = ar2.length - 1; i >= 0; i--)
        {
            if(ar2[i] < ar1[ar1.length - 1])
            {
                ar2[i] = ar2[i] ^ ar1[ar1.length - 1] ^ (ar1[ar1.length - 1] = ar2[i]);
                int insertIdx = recBinSearch(ar1, 0, ar1.length - 2, ar1[ar1.length - 1]) + 1;
                reorder(ar1, insertIdx);
            }
        }

        return arrays;
    }

    private static int recBinSearch(int[] a, int left, int right, int target)
    {
        int mid = (left + right)/2;
        if(left > right)
        {
            return mid;
        }
        else if(a[mid] == target)
        {
            return mid;
        }
        else if(a[mid] > target)
        {
            return recBinSearch(a, left, mid - 1, target);
        }
        else
        {
            return recBinSearch(a, mid + 1, right, target);
        }
    }

    private static void reorder(int[] a, int insertIdx)
    {
        while(insertIdx < a.length - 1)
        {
            a[insertIdx] = a[insertIdx] ^ a[a.length - 1] ^ (a[a.length - 1] = a[insertIdx]);
            insertIdx++;
        }
    }
}
