class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   int count = 0;
       int longest = 1;
       Set<Integer> set = new HashSet<>();
       
       for(int element : arr) {
           set.add(element);
       }
       
       for(int unique : set) {
           if(!set.contains(unique - 1)) {
               count = 1;
               int seq = unique;
               while(set.contains(seq + 1)) {
                   seq += 1;
                   count++;
               }
               
               longest = Math.max(longest, count);
           }
       }
       
       return longest;
	}
}
