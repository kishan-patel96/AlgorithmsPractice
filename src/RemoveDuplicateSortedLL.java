//LC #83
public class RemoveDuplicateSortedLL
{
    public static SinglyLL deleteDuplicates(SinglyLL head)
    {
        SinglyLL curr = head;
        while(curr != null)
        {
            while(curr.next != null && curr.val == curr.next.val)
            {
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }
}
