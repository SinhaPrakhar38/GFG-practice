class Solution {
    Node sortedInsert(Node head, int key) {
        // Add your code here.
        Node temp=new Node(key);
        if(head.data>key){
            temp.next=head;
            head=temp;
        }
        else{
            Node cur=head;
            while(cur.next!=null && cur.next.data<temp.data){
                cur=cur.next;
            }
            temp.next=cur.next;
            cur.next=temp;
        }
        return head;
    }
}
