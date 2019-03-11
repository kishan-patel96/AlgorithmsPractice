public class TrappingRainWater
{
    public static int getArea(int[] elevations)
    {
        int area = 0;
        int left = elevations[0], right = elevations[elevations.length - 1];

        for(int l = 1, r = elevations.length - 2; l <= r;)
        {
            if(left < right)
            {
                if(left < elevations[l])
                {
                    left = elevations[l];
                }
                else
                {
                    area += left - elevations[l];
                }
                l++;
            }
            else
            {
                if(right < elevations[r])
                {
                    right = elevations[r];
                }
                else
                {
                    area += right - elevations[r];
                }
                r--;
            }
        }
        return area;
    }
}
