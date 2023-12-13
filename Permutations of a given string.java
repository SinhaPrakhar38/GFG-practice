class Solution {
    HashSet<String> set = new HashSet<>();
    public void helper(String str, List<String> ans, String psf){
        if (str.isEmpty()){
            if (!set.contains(psf)){
                set.add(psf);
                ans.add(psf);
            }
            return;
        }

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String first = str.substring(0, i);
            String second = str.substring(i+1);
            helper(first + second, ans, psf + ch);
        }
    }
    public List<String> find_permutation(String S) {
        // Code here
        List<String> ans = new ArrayList<>();
        helper(S, ans, "");
        Collections.sort(ans);
        return ans;
    }
}
