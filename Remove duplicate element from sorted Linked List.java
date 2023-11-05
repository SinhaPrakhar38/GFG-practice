class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here	
	if (head == null) return null;
    if (head.next == null) return head;
    
    Node curr = head;
    while (curr.next != null)
    {
        if (curr.next.data == curr.data)
        {
            curr.next = curr.next.next;
            return removeDuplicates(head);
        }
        curr = curr.next;
    }
    return head;
    }
}
