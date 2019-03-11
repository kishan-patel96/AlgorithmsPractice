public class SinglyLL
{
    public int val;
    public SinglyLL next;

    public SinglyLL()
    {

    }

    public SinglyLL(int val)
    {
        this.val = val;
    }

    public SinglyLL(int val, SinglyLL next)
    {
        this.val = val;
        this.next = next;
    }
}
