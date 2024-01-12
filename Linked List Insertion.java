class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        Node newnode = new Node(x);
        newnode.next = head ;
        head = newnode;
         return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        if(head == null){
            return new Node(x);
        }
        
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = new Node(x);
        return head;
    }
}
