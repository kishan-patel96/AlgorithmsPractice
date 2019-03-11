public class BuySellMaxProfit
{
    public static int maxProfit(int[] a)
    {
        if(a == null || a.length <= 1)
        {
            return 0;
        }
        int max = 0;
        Integer buyIdx = null;
        for(int i = 0; i < a.length - 1; i++)
        {
            if(buyIdx == null)
            {
                if(a[i] < a[i + 1])
                {
                    System.out.println("Buy on Day: " + i);
                    buyIdx = i;
                }
            }
            else
            {
                if(a[i] > a[i + 1])
                {
                    System.out.println("Sell on Day: " + i);
                    max += a[i] - a[buyIdx];
                    buyIdx = null;
                }
            }
        }
        if(buyIdx != null)
        {
            System.out.println("Sell on Day: " + (a.length - 1));
            max += a[a.length - 1] - a[buyIdx];
        }
        return max;
    }
}
