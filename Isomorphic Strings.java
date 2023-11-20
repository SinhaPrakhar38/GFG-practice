class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
       if(str1.length()!=str2.length()) return false;
       HashMap<Character,Character>map=new HashMap<>();
       for(int i=0;i<str1.length();i++){
           char ch1=str1.charAt(i);
           char ch2=str2.charAt(i);
           if(!map.containsKey(ch1)){
              if(map.containsValue(ch2)){
                  return false;
              }
                  
              else{
                  map.put(ch1,ch2);
              }
           }else{
               if(map.get(ch1)!=ch2) return false;
           }
       }
       return true;
    }
}
