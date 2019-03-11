//LC #2
public class Add2Nums
{
    public static SinglyLL addTwoNumbers(SinglyLL l1, SinglyLL l2)
    {
        SinglyLL head = new SinglyLL(0);
        SinglyLL curr = head;
        int carry = 0;
        while(l1 != null || l2 != null)
        {
            int sum;
            if(l1 != null && l2 != null)
            {
                sum = (l1.val + l2.val + carry) % 10;
                carry = l1.val + l2.val + carry > 9 ? 1:0;
                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l1 == null)
            {
                sum = (l2.val + carry) % 10;
                carry = l2.val + carry > 9 ? 1:0;
                l2 = l2.next;
            }
            else
            {
                sum = (l1.val + carry) % 10;
                carry = l1.val + carry > 9 ? 1:0;
                l1 = l1.next;
            }
            curr.next = new SinglyLL(sum);
            curr = curr.next;
        }
        if(carry == 1)
        {
            curr.next = new SinglyLL(1);
        }
        return head.next;
    }
}
