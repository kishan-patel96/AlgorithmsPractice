//LC #67
public class AddBinary
{
    public static String addBinary(String a, String b)
    {
        StringBuilder s = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0)
        {
            int res;
            if(i >= 0 && j >= 0)
            {
                res = (a.charAt(i--) - '0') + (b.charAt(j--) - '0') + carry;
            }
            else if(j >= 0)
            {
                res = (b.charAt(j--) - '0') + carry;
            }
            else
            {
                res = (a.charAt(i--) - '0') + carry;
            }
            carry = 0;
            if(res > 1)
            {
                res = res % 2;
                carry = 1;
            }
            s.append(res);
        }
        if(carry == 1)
        {
            s.append(carry);
        }
        return new String(s.reverse());
    }
}
