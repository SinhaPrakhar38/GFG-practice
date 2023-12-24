
class Solution
{
    public static Node changevalue(Node temp,Node head){
        temp.data = 0;
        Node temp2 = head;
        if(temp == temp2){
            Node newNode = new Node(1);
            newNode.next = temp;
            head = newNode;
            return head;
        }
        while(temp2.next != temp){
            temp2 = temp2.next;
        }
        if(temp2.data < 9){
            temp2.data = temp2.data + 1;
            return head;
        }else{
            return changevalue(temp2,head);
        }
    } 
    public static Node addOne(Node head) {
        // Write your code here.
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        if(temp.data < 9){
            temp.data = temp.data + 1;
            return head;
        }else{
            return changevalue(temp,head);
        }
    }
}
