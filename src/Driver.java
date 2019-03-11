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

        int[] ar1 = new int[]{1, 5, 9, 10, 15, 20};
        int[] ar2 = new int[]{1, 2, 3, 4};

        MergeTwoSortedArrays.merge(ar1, ar2);
        for(int i : ar1)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i : ar2)
        {
            System.out.print(i + " ");
        }
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

