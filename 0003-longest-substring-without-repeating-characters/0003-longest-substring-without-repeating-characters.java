class Solution {
    public int lengthOfLongestSubstring(String s) {
    //     if(s.length()==0) return 0;
    //     if(s.length()==1)   return 1;
    //     String res="";
    //     String s1="";
    //     int max=0;
    //     res=res+s.charAt(0);
    //     for(int i=1;i<s.length();i++)
    //     {

    //         char c = s.charAt(i);
    //         s1=c+"";
    //         if(!res.contains(s1))
    //         {
    //             res=res+c;
    //             max=Math.max(res.length(),max);
    //         }
    //         else
    //         {
    //             max=Math.max(res.length(),max);
    //             res=s.charAt(i)+"";
    //             s1="";
    //         }
    //     }
    //     return max;
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        String res = "";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!res.contains(c + "")) {
                res = res + c;
            } else {
                int index = res.indexOf(c);
                res = res.substring(index + 1) + c;
            }
            max = Math.max(max, res.length());
        }
        return max;
    }
}