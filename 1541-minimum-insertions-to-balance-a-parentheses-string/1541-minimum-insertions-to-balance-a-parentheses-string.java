class Solution {
    public int minInsertions(String s) {
        Deque<Character> st = new ArrayDeque<>();
        int ans = 0;
        int i = 0;
        int n = s.length();
        while (i < n) {
            if (s.charAt(i) == '(') 
            {
                st.push('(');
                i++;
            } else 
            {
                if (i + 1 < n && s.charAt(i + 1) == ')') 
                {
                    i += 2;
                } else 
                {
                    ans++;
                    i++;
                }
                if (!st.isEmpty()) 
                {
                    st.pop();
                } else 
                {
                    ans++;
                }
            }
        }
        ans += 2 * st.size();
        return ans;
    }
}