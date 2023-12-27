class Solution:
    #Complete this function
    # Function to find the maximum index difference.
    def maxIndexDiff(self,a, N): 
        ##Your code here
        left_min = [0]*N
        right_max = [0]*N
        min_ind = 0
        max_ind = 0
        
        left_min[0] = a[0]
        for i in range(1,N):
               left_min[i] = min(a[i],left_min[i-1])
                
        
                    
        right_max[N-1] = a[N-1]
        for j in range(N-2,-1,-1):
            right_max[j] = max(a[j],right_max[j+1])
        i = 0
        j = 0
        max_ind = -1
        while i<N and j<N:
            if left_min[i] <= right_max[j]:
               max_ind = max(max_ind,j-i)
               j+=1
            else:
               i+=1
        return max_ind
