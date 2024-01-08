class Solution {
    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node agla = null;
        while(curr != null){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        return prev;
    }
    void reorderlist(Node head) {
        Node slow = head; 
        Node fast = head;
        
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow.next == null){
            
        }
        Node a = reverse(slow.next);
        slow.next = a;
        Node p1 = head;
        Node t = head;
        while(slow.next != null){
            Node p2 = slow.next;
            slow.next = p2.next;
            t = p1.next;
            p2.next = t;
            p1.next = p2;
            p1 = t;
            t = t.next;
        }
    }
} 
