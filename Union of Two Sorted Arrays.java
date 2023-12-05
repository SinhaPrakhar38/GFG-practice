class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> list = new ArrayList<>();
        
        
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        
        for(int i = 0;i< n;i++)
        {
            hs1.add(arr1[i]);
        }
        
        for(int i = 0;i< m;i++)
        {
            hs2.add(arr2[i]);
        }
        
        hs1.addAll(hs2);
        list.addAll(hs1);
        
        Collections.sort(list);
        return list;
    }
}
