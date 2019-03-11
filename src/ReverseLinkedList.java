public class ReverseLinkedList
{
    public static SinglyLL reverseLL(SinglyLL root)
    {
        SinglyLL prev = null;
        SinglyLL next = root;
        while(root != null)
        {
            next = root.next;
            root.next = prev;
            prev = root;
            root = next;
        }
        return prev;
    }
}
