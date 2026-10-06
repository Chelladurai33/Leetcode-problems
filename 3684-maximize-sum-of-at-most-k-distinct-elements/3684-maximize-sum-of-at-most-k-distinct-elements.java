class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
       TreeSet<Integer> set= new TreeSet<>();
       int n=nums.length;
       for(int i=0;i<n;i++)
       {
          set.add(nums[i]);
       }
       int arr[]=new int[set.size()];
       int ind=0;
       for(int i:set)
       {
           arr[ind++]=i;
       }  
       int mn=k;
       if(arr.length<k)
       {
        mn=arr.length;
       }
       int res[]=new int[mn]; 
       int index=0;
       for(int i=arr.length-1;i>=0;i--)
       {
            if(k!=0)
            {
                res[index++]=arr[i];
                k--;
            }
       }
       return res;
    }
}