class GfG
{
    boolean isCircular(Node head)
    {
// Your code here
if(head==null){
    return true;
}
 
Node currNode=head;
 
while(currNode.next!=head && currNode.next!=null){
    currNode=currNode.next;
}
 
if(currNode.next==head){
    return true;
}
 
return false;
    }
}
