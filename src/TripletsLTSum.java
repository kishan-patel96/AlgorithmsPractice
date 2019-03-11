import java.util.Arrays;

public class TripletsLTSum
{
    public static int numOfTriplets(int[] a, int sum)
    {
        Arrays.sort(a);
        int triplets = 0;

        for(int i = 0; i < a.length - 2; i++)
        {
            int j = i + 1;
            int k = a.length - 1;

            while(j < k)
            {
                if(a[i] + a[j] + a[k] >= sum)
                {
                    k--;
                }
                else
                {
                    triplets += (k - j);
                    j++;
                }
            }
        }
        return triplets;
    }
}
