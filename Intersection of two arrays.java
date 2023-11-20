class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : a) {
            list.add(i);
        }
        
        Set<Integer> set = new HashSet<>(list);
        int count=0;
        for(int i=0;i<m;i++)
        {
            if(set.contains(b[i]))
            {
                count++;
                set.remove(b[i]);
            }
        }
        return count;
    }
}
