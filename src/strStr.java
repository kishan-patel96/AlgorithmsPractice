//LC #28
public class strStr
{
    //Naive
    public static int strStr(String haystack, String needle)
    {
        if(needle.isEmpty())
        {
            return 0;
        }
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++)
        {
            for(int j = 0; j < needle.length(); j++)
            {
                if(haystack.charAt(i + j) != needle.charAt(j))
                {
                    break;
                }
                else if(j == needle.length() - 1)
                {
                    return i;
                }
            }
        }
        return -1;
    }

    //Rabin-Karp
    public static int strStr2(String haystack, String needle)
    {
        if(needle.length() > haystack.length())
        {
            return -1;
        }

        int base = 26;
        int hHash = 0;
        int nHash = 0;
        int powerS = 1;

        for(int i = 0; i < needle.length(); i++)
        {
            powerS = i > 0 ? powerS * base : 1;
            hHash = hHash * base + haystack.charAt(i);
            nHash = nHash * base + needle.charAt(i);
        }

        for(int i = needle.length(); i < haystack.length(); i++)
        {
            if(hHash == nHash && haystack.substring(i - needle.length(), i).equals(needle))
            {
                return i - needle.length();
            }

            hHash -= haystack.charAt(i - needle.length()) * powerS;
            hHash = hHash * base + haystack.charAt(i);
        }

        if(hHash == nHash && haystack.substring(haystack.length() - needle.length()).equals(needle))
        {
            return haystack.length() - needle.length();
        }
        return -1;
    }

    //Rabin-Karp
    public static int strStr3(String haystack, String needle)
    {
        int M = needle.length();
        int N = haystack.length();
        int i, j;
        int p = 0;
        int t = 0;
        int h = 1;
        int d = 256;
        int q = 31;

        for (i = 0; i < M-1; i++)
        {
            h = (h * d) % q;
        }

        for (i = 0; i < M; i++)
        {
            p = (d*p + needle.charAt(i))%q;
            t = (d*t + haystack.charAt(i))%q;
        }

        for (i = 0; i <= N - M; i++)
        {
            if ( p == t )
            {
                for (j = 0; j < M; j++)
                {
                    if (haystack.charAt(i+j) != needle.charAt(j))
                    {
                        break;
                    }
                }
                if (j == M)
                {
                    return i;
                }
            }
            if ( i < N-M )
            {
                t = (d*(t - haystack.charAt(i)*h) + haystack.charAt(i+M))%q;
                if (t < 0)
                {
                    t = (t + q);
                }
            }
        }
        return -1;
    }

    //Naive, but elegant!
    public static int strStr4(String haystack, String needle)
    {
        if(needle.isEmpty())
        {
            return 0;
        }
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++)
        {
            if(haystack.substring(i, i + needle.length()).equals(needle))
            {
                return i;
            }
        }
        return -1;
    }

    //KMP... This one is complicated
}
