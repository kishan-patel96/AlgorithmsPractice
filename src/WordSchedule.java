import java.util.*;

public class WordSchedule
{
    private static List<String> permutations;
    private static int DAYS;

    public static List<String> findSchedules(int maxWeekHours, int maxDayHours, String pattern)
    {
        List<Integer> idxs = new ArrayList<>();
        int remainingHours = maxWeekHours;
        for(int i = 0; i < pattern.length(); i++)
        {
            if(pattern.charAt(i) == '?')
            {
                idxs.add(i);
            }
            else
            {
                remainingHours -= (pattern.charAt(i) - '0');
            }
        }
        DAYS = idxs.size();

        permutations = new ArrayList<>();
        findPermutations(remainingHours, maxDayHours, idxs.size(), "");

        List<String> schedules = new ArrayList<>();
        for(String s : permutations)
        {
            //System.out.println(s);
            StringBuilder sch = new StringBuilder(pattern);
            for(int i = 0; i < idxs.size(); i++)
            {
                sch.setCharAt(idxs.get(i), s.charAt(i));
            }
            schedules.add(new String(sch));
        }
        return schedules;
    }

    private static void findPermutations(int rem, int max, int days, String s)
    {
        if(rem == 0)
        {
            while(s.length() < DAYS)
            {
                s += '0';
            }
            permutations.add(s);
            return;
        }
        for(int i = max; i >= 0; i--)
        {
            if(days == 0 || max * days < rem)
            {
                break;
            }
            findPermutations(rem - i, max, days - 1, s + i);
        }
    }
}
