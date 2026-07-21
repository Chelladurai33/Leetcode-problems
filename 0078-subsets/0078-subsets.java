class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list1=new ArrayList<>();
        list1.add(new ArrayList<>());
        for(int num:nums)
        {
            int a=list1.size();
            for(int i=0;i<a;i++)
            {
                List<Integer> list2=new ArrayList<>(list1.get(i));
                list2.add(num);
                list1.add(list2);
            }
        }
        return list1;
    }
}