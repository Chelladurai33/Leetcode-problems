class Solution {
    public int lengthOfLastWord(String s) {
        String str[] = s.split(" ");
        String str1=str[str.length-1];
        String a=str1.toString();
        int b=  a.length();
        return b;
    }
}