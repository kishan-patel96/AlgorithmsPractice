public class ProductLessThanK
{
    public static int numSubarrays(int[] a, int maxProd)
    {
        int count = 0;
        int prod = 1;
        for(int left = 0, right = 0; right < a.length; right++)
        {
            prod *= a[right];
            while(prod >= maxProd && left < right)
            {
                prod /= a[left++];
            }
            if(prod < maxProd)
            {
                count = count + right - left + 1;
            }
        }

        return count;
    }
}
