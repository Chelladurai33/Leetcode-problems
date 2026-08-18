class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
       Set<Integer> set1=new HashSet<>();
       Set<Integer> set2 = new HashSet<>();
       for(int i: nums1)
       {
           set1.add(i);
       }
       for(int i:nums2)
       {
           if(set1.contains(i))
           {
            set2.add(i);
           }
       }
       for(int i:nums3)
       {
            if(set1.contains(i))
            {
                set2.add(i);
            }
       }
       Set<Integer> set3=new HashSet<>();
       Set<Integer> set4=new HashSet<>();
       for(int i:nums2)
       {
           set3.add(i);
       }
       for(int i:nums3)
       {
            if(set3.contains(i))
            {
                set4.add(i);
            }
       }
       Set<Integer> finset=new HashSet<>();
       for(int i:set2)
       {
        finset.add(i);
       }
       for(int i:set4)
       {
        finset.add(i);
       }
       ArrayList<Integer> list=new ArrayList<>();
       for(int i:finset)
       {
            list.add(i);
       }
       return list;
    }
}