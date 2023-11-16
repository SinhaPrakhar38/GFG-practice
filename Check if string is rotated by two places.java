class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        if(str2.equals(rotateRight(str1,2)) ||str2.equals(rotateLeft(str1,2))) return true;
        
        
        return false;
    }
    
    

//method to rotate string clock wise
    private static String rotateRight(String s,int d) {
       return rotateLeft(s,s.length()-d);
    }

//method to rotate string anti clock wise

    private static String rotateLeft(String s,int d) {
        return s.substring(d)+s.substring(0,d);
    }
    
}
