//LC #38
public class CountAndSay
{
    public static String countAndSay(int n)
    {
        StringBuilder prev = new StringBuilder();
        prev.append(1);
        for(int i = 1; i < n; i++)
        {
            int count = 0;
            char c = prev.charAt(0);
            StringBuilder nth = new StringBuilder();
            for(int j = 0; j < prev.length(); j++)
            {
                if(c == prev.charAt(j))
                {
                    count++;
                }
                else
                {
                    nth.append(count);
                    nth.append(c);
                    count = 1;
                    c = prev.charAt(j);
                }
            }
            nth.append(count);
            nth.append(c);
            prev = nth;
        }
        return new String(prev);
    }
}
