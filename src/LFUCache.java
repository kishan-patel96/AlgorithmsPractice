import java.util.*;

public class LFUCache
{
    private int capacity;
    private Map<Integer, Integer> values;
    private Map<Integer, Integer> frequency;
    private Map<Integer, LinkedHashSet<Integer>> minFreq;
    private int min;

    public LFUCache(int capacity)
    {
        this.capacity = capacity;
        values = new HashMap<>();
        frequency = new HashMap<>();
        minFreq = new HashMap<>();
    }

    public int get(int key)
    {
        return 0;
    }

    public void put(int key, int value)
    {

    }
}
