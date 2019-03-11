//LC 121
public class BestTimeBuySell
{
    public static int maxProfit(int[] prices)
    {
        if(prices.length <= 1)
        {
           return 0;
        }
        int max = 0;
        int min = prices[0];
        for(int i = 1; i < prices.length; i++)
        {
            if(prices[i] > min)
            {
                max = Math.max(max, prices[i] - min);
            }
            else if(prices[i] < min)
            {
                min = prices[i];
            }
        }
        return max;
    }
}
