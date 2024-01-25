class Solution
{
    public long reverse_digit(long n)
    {
        // Code here
        String rev="";
        String digit=Long.toString(n);
        for(int i=digit.length()-1;i>=0;i--){
            rev+=digit.charAt(i);
        }
        return  Long.parseLong(rev);
    }
}
