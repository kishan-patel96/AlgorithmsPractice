import java.util.*;

//LC #6
public class ZigZagConversion
{
    public static String convert(String s, int numRows) {
        if(numRows == 1)
        {
            return s;
        }
        List<StringBuilder> strs = new ArrayList<>();
        for(int i = 0; i < numRows; i++)
        {
            strs.add(new StringBuilder());
        }

        boolean inc = false;
        for(int i = 0, j = 0; i < s.length(); i++)
        {
            strs.get(j).append(s.charAt(i));
            if(j == 0 || j == numRows - 1)
            {
                inc = !inc;
            }

            if(inc)
            {
                j++;
            }
            else
            {
                j--;
            }
        }

        StringBuilder str = strs.get(0);
        for(int i = 1; i < strs.size(); i++)
        {
            str.append(strs.get(i).toString());
        }
        return str.toString();
    }
}
