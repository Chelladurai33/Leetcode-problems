class Solution {
    public int[][] onesMinusZeros(int[][] nums) {
        int a=nums.length;
        int b= nums[0].length;
        int row[] = new int[a];
        int col[]=new int[b];
        for(int i=0;i<a;i++)
        {
            int onecount=0;
            for(int j=0;j<b;j++)
            {
                if(nums[i][j]==1)
                {
                   onecount++;
                }
            }
            row[i]=onecount;
        }
        for(int i=0;i<b;i++)
        {
            int onecount=0;
            for(int j=0;j<a;j++)
            {
                if(nums[j][i]==1)
                {
                   onecount++;
                }
            }
            col[i]=onecount;
        }
        for(int i=0;i<a;i++)
        {
            int one1 = row[i];
            int zero1= a-one1;
            for(int j=0;j<b;j++)
            {
                int one2=col[j];
                int zero2=b-one2;
                nums[i][j]=one1+one2-zero1-zero2;
                }
        }
        return nums;
    }
}