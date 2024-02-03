class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        String rev="";
        String Num= Integer.toString(n);
        int N= Num.length();
        for(int i=N-1;i>=0;i--){
            rev+=Num.charAt(i);
        }
        if(Num.equals(rev)) return "Yes";
        else return "No";
    }
}
