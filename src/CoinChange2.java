import java.util.*;

//LC 518
public class CoinChange2
{
    //Faster and less space!
    public static int change(int amount, int[] coins)
    {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i-coin];
                System.out.print(dp[i] + " ");
            }
        }
        return dp[amount];
    }

    public static int change2(int amount, int[] coins) {
        int[][] dp = new int[coins.length+1][amount+1];
        dp[0][0] = 1;

        for (int i = 1; i <= coins.length; i++) {
            dp[i][0] = 1;
            for (int j = 1; j <= amount; j++) {
                dp[i][j] = dp[i-1][j] + (j >= coins[i-1] ? dp[i][j-coins[i-1]] : 0);
                //System.out.print(dp[i][j] + " ");
            }
            //System.out.println();
        }
        return dp[coins.length][amount];
    }
}
