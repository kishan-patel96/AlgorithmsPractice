import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Driver
{

    public static void main(String[] args)
    {
        System.out.println(ProductLessThanK.numSubarrays(new int[]{1,9,2,8,6,4,3}, 100));
    }

    /*
    public static List<Integer> getRow(int rowIndex)
    {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= rowIndex/2; i++)
        {
            if(i != 0)
            {
                list.add((getNum(rowIndex, i).divide(getDen(i)).intValue()));
            }
            else
            {
                list.add(1);
            }
        }
        //System.out.println(list);
        if(rowIndex % 2 == 1)
        {
            for(int i = list.size() - 1; i >= 0; i--)
            {
                list.add(list.get(i));
            }
        }
        else
        {
            for(int i = list.size() - 2; i >= 0; i--)
            {
                list.add(list.get(i));
            }
        }
        return list;
    }

    public static BigInteger getNum(int n, int idx)
    {
        BigInteger prod = BigInteger.valueOf(n);
        for(int i = 1; i < idx; i++)
        {
            prod = prod.multiply(BigInteger.valueOf(n - i));
        }
        return prod;
    }

    public static BigInteger getDen(int idx)
    {
        BigInteger prod = BigInteger.valueOf(1);
        while(idx > 0)
        {
            prod = prod.multiply(BigInteger.valueOf(idx--));
        }
        return prod;
    }
    */
}

class Supercl
{
    static int x;
    public void m()
    {
        System.out.println("in superclass");
    }
    int getX()
    {
        return x;
    }
}

class Subcl extends Supercl
{
    int x = 3;
    int getX()
    {
        return x;
    }
}

class Runner extends Thread
{
    @Override
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Hello " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}

