class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        String s1="";
        String s2="";
        int n=s.length();
        int vs1count=0;
        int vs2count=0;
        for(int i=0;i<s.length()/2;i++)
        {
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                vs1count++;
            }
        }
        for(int i=s.length()/2;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                vs2count++;
            }
        }
        
        return vs1count==vs2count;

    }
}