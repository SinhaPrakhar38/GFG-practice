class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        if(a.length()!=b.length())
            return false;
        int i,n=a.length();
        char ar[]=a.toCharArray();
        char br[]=b.toCharArray();
        Arrays.sort(ar);
        Arrays.sort(br);
        for(i=0;i<n;i++){
            if(ar[i]!=br[i])
                return false;
        }
        return true;
        
    }
}
