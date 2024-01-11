class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
if(head==null) return 0;
return 1+getCount(head.next);
    }
}
