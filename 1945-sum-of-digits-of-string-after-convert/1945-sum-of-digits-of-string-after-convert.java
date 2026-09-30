class Solution {
    public int getLucky(String s, int k) {
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int b = c - 'a' + 1;
            if (b >= 10) {
                a += (b / 10) + (b % 10);
            } else {
                a += b;
            }
        }
        k--; 
        while (k > 0) {
            int sum = 0;
            while (a != 0) {
                sum += a % 10;
                a /= 10;
            }
            a = sum;
            k--;
        }
        return a;
    }
}