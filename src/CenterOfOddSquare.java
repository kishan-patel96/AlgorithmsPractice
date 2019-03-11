public class CenterOfOddSquare
{
    private static int[][] a;
    private static String priorityCorner;
    private static Integer maxPoints;
    private static String bestPath;

    public static String findBestPath(int[][] a)
    {
        CenterOfOddSquare.a = a;

        topLeft(0, 0, 0, "");
        topRight(0, a.length - 1, 0, "");
        bottomRight(a.length - 1, a.length - 1, 0, "");
        bottomLeft(a.length - 1, 0, 0, "");

        System.out.println("Corner: " + priorityCorner);
        System.out.println("Most Points: " + maxPoints);
        return bestPath;
    }

    private static void topLeft(int i, int j, int points, String path)
    {
        if(i == a.length/2 && j == a.length/2)
        {
            if(maxPoints == null)
            {
                priorityCorner = "Top-Left";
                maxPoints = points + a[i][j];
                bestPath = path;
            }
            else
            {
                if(points > maxPoints)
                {
                    priorityCorner = "Top-Left";
                    maxPoints = points + a[i][j];
                    bestPath = path;
                }
            }
            //System.out.println(path);
            return;
        }
        if(j < a.length/2)
        {
            topLeft(i, j + 1, points + a[i][j], path + "r");
        }
        if(i < a.length/2)
        {
            topLeft(i + 1, j, points + a[i][j], path + "d");
        }
    }

    private static void topRight(int i, int j, int points, String path)
    {
        if(i == a.length/2 && j == a.length/2)
        {
            if(maxPoints == null)
            {
                priorityCorner = "Top-Right";
                maxPoints = points + a[i][j];
                bestPath = path;
            }
            else
            {
                if(points > maxPoints)
                {
                    priorityCorner = "Top-Right";
                    maxPoints = points + a[i][j];
                    bestPath = path;
                }
            }
            //System.out.println(path);
            return;
        }
        if(j > a.length/2)
        {
            topRight(i, j - 1, points + a[i][j], path + "l");
        }
        if(i < a.length/2)
        {
            topRight(i + 1, j, points + a[i][j], path + "d");
        }
    }

    private static void bottomRight(int i, int j, int points, String path)
    {
        if(i == a.length/2 && j == a.length/2)
        {
            if(maxPoints == null)
            {
                priorityCorner = "Bottom-Right";
                maxPoints = points + a[i][j];
                bestPath = path;
            }
            else
            {
                if(points > maxPoints)
                {
                    priorityCorner = "Bottom-Right";
                    maxPoints = points + a[i][j];
                    bestPath = path;
                }
            }
            //System.out.println(path);
            return;
        }
        if(j > a.length/2)
        {
            bottomRight(i, j - 1, points + a[i][j], path + "l");
        }
        if(i > a.length/2)
        {
            bottomRight(i - 1, j, points + a[i][j], path + "u");
        }
    }

    private static void bottomLeft(int i, int j, int points, String path)
    {
        if(i == a.length/2 && j == a.length/2)
        {
            if(maxPoints == null)
            {
                priorityCorner = "Bottom-Left";
                maxPoints = points + a[i][j];
                bestPath = path;
            }
            else
            {
                if(points > maxPoints)
                {
                    priorityCorner = "Bottom-Left";
                    maxPoints = points + a[i][j];
                    bestPath = path;
                }
            }
            //System.out.println(path);
            return;
        }
        if(j < a.length/2)
        {
            bottomLeft(i, j + 1, points + a[i][j], path + "r");
        }
        if(i > a.length/2)
        {
            bottomLeft(i - 1, j, points + a[i][j], path + "u");
        }
    }
}
