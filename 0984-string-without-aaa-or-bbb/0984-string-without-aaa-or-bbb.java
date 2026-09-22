class Solution {
    public String strWithout3a3b(int a, int b) {
        String s = "";
        int c1 = 0;
        int c2 = 0;
        while (a > 0 || b > 0) {
            if ((a > b && c1 < 2) || c2 == 2) 
            {
                s += "a";
                a--;
                c1++;
                c2 = 0;
            } 
            else 
            {
                s += "b";
                b--;
                c2++;
                c1 = 0;
            }
        }
        return s;
    }
}