class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int [nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            int a=nums1[i];
            int ind= -1;
            
            for(int j=0;j<nums2.length;j++)
            {
                if(a==nums2[j])
                {
                    ind=j;
                    break;
                }
            }
            int next=-1;
            for(int k=ind+1;k<nums2.length;k++)
            {
                if(nums2[k]>a)
                {
                    next=nums2[k];
                    break;
                }
                
            }
           
            arr[i] = next;
        }
        return arr;
    }
}