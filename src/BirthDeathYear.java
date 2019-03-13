import java.util.*;

public class BirthDeathYear
{
    //O(n^2)
    public static int numberAlive(List<Integer> birth, List<Integer> death)
    {
        int alive_max = 0;
        for(int year : birth)
        {
            int alive = 0;
            for(int i = 0; i < death.size(); i++)
            {
                if(year < death.get(i) && year >= birth.get(i))
                {
                    alive++;
                }
            }
            alive_max = Math.max(alive_max, alive);
        }
        return alive_max;
    }

    //O(y + n), where y is max_birth_year - min_birth_year, where n is birth.size()
    public static int numberAliveLinear(List<Integer> birth, List<Integer> death)
    {
        Map<Integer, Integer> birthYears = new HashMap<>();
        Map<Integer, Integer> deathYears = new HashMap<>();
        birthYears.put(birth.get(0), 1);
        deathYears.put(death.get(0), 1);
        int minBirthYear = birth.get(0);
        int maxBirthYear = birth.get(0);

        for(int i = 1; i < birth.size(); i++)
        {
            minBirthYear = Math.min(minBirthYear, birth.get(i));
            maxBirthYear = Math.max(maxBirthYear, birth.get(i));
            if(birthYears.containsKey(birth.get(i)))
            {
                birthYears.put(birth.get(i), birthYears.get(birth.get(i)) + 1);
            }
            else
            {
                birthYears.put(birth.get(i), 1);
            }
            if(deathYears.containsKey(death.get(i)))
            {
                deathYears.put(death.get(i), deathYears.get(death.get(i)) + 1);
            }
            else
            {
                deathYears.put(death.get(i), 1);
            }
        }

        int aliveMax = 0;
        int aliveCurr = 0;

        for(; minBirthYear <= maxBirthYear; minBirthYear++)
        {
            if(birthYears.containsKey(minBirthYear))
            {
                aliveCurr += birthYears.get(minBirthYear);
            }
            aliveMax = Math.max(aliveMax, aliveCurr);
            if(deathYears.containsKey(minBirthYear))
            {
                aliveCurr -= deathYears.get(minBirthYear);
            }
        }
        return aliveMax;
    }
}

