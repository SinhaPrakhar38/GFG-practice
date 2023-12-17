class Solution{
    static String findLargest(int N, int S){
        //Your Code Here
       StringBuilder str = new StringBuilder();
           int sumdig=0;
     for(int i=0;i<N;i++){
         str.append((char)(9+'0'));
         sumdig=sumdig+9;
     } 
     String ans="";
     int i = str.length()-1;
     while(i>=0){
         int j=9;
         for(;j>=0;j--){ 
   str.setCharAt(i, (char)(j+'0'));  
   if(sumdig==S){
                ans= str.toString();
           if(ans.charAt(0)=='0'&&S==0&&ans.length()>1){
               return "-1";
           }
           return ans;
            }
            if(j!=0){
            sumdig--;
            }
               }
         i--;
     }
       return "-1";
    }
}
