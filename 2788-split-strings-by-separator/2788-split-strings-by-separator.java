class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char sep) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<words.size();i++)
        {
            spt(words.get(i),list,sep);
        }
        return list;
    }
    public static void spt(String s,List<String> list,char sep)
    {
        String str[]=s.split("[" +sep+"]");
        for(int i=0;i<str.length;i++)
        {
           // String mn=str[i];
            if(str[i]!=""){
                   list.add(str[i]);
            }
        }
    }
}