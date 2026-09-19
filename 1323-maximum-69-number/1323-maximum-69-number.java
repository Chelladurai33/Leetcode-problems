class Solution {
    public int maximum69Number (int num) {
        if(num==9999||num==999||num==99) return num;
        int arr[]=new int[4];
        int ind=3;
        while(num!=0)
        {
            int rem = num%10;
            arr[ind--]=rem;
            num=num/10;
        }
        for(int i=0;i<4;i++)
        {
            if(arr[i]==0)
            {
                continue;
            }
            else if(arr[i]==6)
            {
                arr[i]=9;
                break;
            }
        }
        int sum=0;
        for(int i=0;i<4;i++)
        {
            sum=sum*10+arr[i];
        }
        return sum;
    }
}