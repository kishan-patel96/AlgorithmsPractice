public class SubRanges
{
    public static int findParentValue(int childValue)
    {
        int total = 1;
        int parentVal = 0;
        while(total < childValue)
        {
            total += ++parentVal;
        }
        return parentVal;
    }
}
