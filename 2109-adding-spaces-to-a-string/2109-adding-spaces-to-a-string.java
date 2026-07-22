class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();
        int ind = 0;
        for (int i = 0; i < s.length(); i++) 
        {
            if (ind < spaces.length && spaces[ind] == i) {
                ans.append(' ');
                ind++;
            }
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}