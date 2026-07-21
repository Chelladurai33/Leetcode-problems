class Solution {
    public String sortVowels(String s) {
        String res=s;
        String vowel="";
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                vowel+=c;
            }
        }
        s=s.replaceAll("[aeiouAEIOU]"," ");
        char arr1[]=s.toCharArray();
        char arr2[]=vowel.toCharArray();
        Arrays.sort(arr2);
        int ind=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==' ')
            {
                arr1[i]=arr2[ind++];
            }
        }
       
       String fin="";
       for(int i=0;i<arr1.length;i++)
       {
            fin+=arr1[i];
       }
        return fin;
    }
}