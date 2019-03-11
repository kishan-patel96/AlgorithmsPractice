import java.util.*;

public class MergeSort
{
    public static int[] mergeSort(int[] a)
    {
        split(a, 0, a.length - 1);
        return a;
    }

    private static void split(int[] a, int left, int right)
    {
        if(left == right)
        {
            return;
        }
        int mid = (left + right)/2;
        split(a, left, mid);
        split(a, mid + 1, right);
        merge(a, left, mid, right);
    }

    private static void merge(int[] a, int left, int mid, int right)
    {
        List<Integer> subArray = new ArrayList<>();
        for(int i = left, j = mid + 1; i != mid + 1 || j != right + 1;)
        {
            if(i != mid + 1 && j != right + 1)
            {
                if(a[i] <= a[j])
                {
                    subArray.add(a[i++]);
                }
                else
                {
                    subArray.add(a[j++]);
                }
            }
            else if(i == mid + 1 && j != right + 1)
            {
                subArray.add(a[j++]);
            }
            else
            {
                subArray.add(a[i++]);
            }
        }
        int idx = 0;
        for(int i = left; i <= right; i++)
        {
            a[i] = subArray.get(idx++);
        }
    }
}
