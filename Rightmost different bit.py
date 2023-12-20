class Solution:
    
    #Function to find the first position with different bits.
    def posOfRightMostDiffBit(self,m,n):
        #Your code here
        c = 0
        
        while m != 0 or n != 0:
            c += 1
            if m%2 != n%2:
                return c
                
            m//=2
            n//=2
        
        return -1
