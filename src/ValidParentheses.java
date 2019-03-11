import java.util.*;

//LC #20
public class ValidParentheses
{
    public static boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            {
                stack.push(s.charAt(i));
            }
            else if(stack.size() == 0 || stack.peek() != s.charAt(i) - 1 && stack.peek() != s.charAt(i) - 2)
            {
                return false;
            }
            else
            {
                stack.pop();
            }
        }
        return (stack.size() == 0) ? true:false;
    }

    public static boolean isValid2(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '(')
            {
                stack.push(')');
            }
            else if (s.charAt(i) == '[')
            {
                stack.push(']');
            }
            else if (s.charAt(i) == '{')
            {
                stack.push('}');
            }
            else if(stack.size() == 0 || stack.peek() != s.charAt(i))
            {
                return false;
            }
            else
            {
                stack.pop();
            }
        }
        return (stack.size() == 0) ? true:false;
    }
}
