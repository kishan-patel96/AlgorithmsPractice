import java.util.*;

public class WellBalanced
{
    public static boolean isWellBalanced(String s)
    {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> m = new HashMap<>();
        m.put('(', ')');
        m.put('[', ']');
        m.put('{', '}');

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            {
                stack.push(m.get(s.charAt(i)));
            }
            else if(stack.isEmpty() || s.charAt(i) != stack.pop())
            {
                return false;
            }
        }
        return stack.size() != 0 ? false:true;
    }
}
