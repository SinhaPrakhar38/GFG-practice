class Solution:
    #Function to remove a loop in the linked list.
    def removeLoop(self, head):
        new=dict()
        s=head
        while s.next:
            if s.next not in new:
                new[s]=1
                s=s.next
            else:
                s.next=None
                return
                break
