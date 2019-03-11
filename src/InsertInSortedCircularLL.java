public class InsertInSortedCircularLL
{
    public static boolean insert(SinglyLL start, SinglyLL n)
    {
        if(start == null)
        {
            return false;
        }
        else
        {
            SinglyLL curr = start;
            boolean failed = true;
            while(curr.next != start)
            {
                if(curr.val >= n.val)
                {
                    curr.val = curr.val ^ n.val ^ (n.val = curr.val);
                    n.next = curr.next;
                    curr.next = n;
                    failed = false;
                    break;
                }
                curr = curr.next;
            }
            if(failed)
            {
                if(curr.val >= n.val)
                {
                    curr.val = curr.val ^ n.val ^ (n.val = curr.val);
                    n.next = curr.next;
                    curr.next = n;
                }
                else
                {
                    n.next = curr.next;
                    curr.next = n;
                }
            }
            return true;
        }
    }
}
