import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Driver
{

    public static void main(String[] args)
    {
        //System.out.println(strStr.strStr("AAAAAAAAAAAAAAAAAB", "AAAAB"));

        //System.out.println(getRow(30));

        /*Runner r1 = new Runner();
        r1.start();

        Runner r2 = new Runner();
        r2.start();*/

        //Supercl supercl = new Subcl();
        //System.out.println(supercl.getX());

        /*double num = 0;
        double left = 0;
        double right = num;
        double mid = (left + right)/2;
        while(Math.round((mid * mid) * 100000.0)/100000.0 != num)
        {
            mid = (left + right)/2;
            System.out.println(mid);
            if(mid * mid > num)
            {
                right = mid;
            }
            else if(mid * mid < num)
            {
                left = mid;
            }
        }
        System.out.println("\n\n" + mid);
        System.out.println(mid*mid);*/

        /*
        int[] a = new int[]{5,4,3,2,1};
        MergeSort m = new MergeSort();
        m.mergeSort(a);
        for(int i : a)
        {
            System.out.print(i + " ");
        }*/

        List<Integer> l1 = new ArrayList<>();
        l1.add(2000);
        l1.add(2000);
        l1.add(1975);
        l1.add(1975);
        l1.add(1803);
        l1.add(1750);
        l1.add(1840);
        l1.add(1803);
        l1.add(1894);

        List<Integer> l2 = new ArrayList<>();
        l2.add(2010);
        l2.add(2010);
        l2.add(2005);
        l2.add(2003);
        l2.add(1809);
        l2.add(1869);
        l2.add(1935);
        l2.add(1921);
        l2.add(1921);

        System.out.println(BirthDeathYear.numberAlive(l1, l2));
        System.out.println(BirthDeathYear.numberAliveLinear(l1, l2));
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

