class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        Stack<String> st = new Stack<>();
        String temp = "";
        String str = S;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                st.push(temp);
                st.push(".");
                temp = "";
            } else {
                temp = temp + str.charAt(i);
            }
        }
        st.push(temp);
        String ans = "";
        for (int i = st.size() - 1; i >= 0; i--) {
            ans += st.get(i);
        }
        return ans;
    }
}
