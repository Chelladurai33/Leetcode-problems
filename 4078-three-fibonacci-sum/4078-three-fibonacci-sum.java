class Solution {
    public boolean threeFibonacciSum(int n) {
        if(n==2|| n==4 || n==6)  return true;
        if(n<=0)   return false;
        List<Integer> list = new ArrayList<>();
        fib(list,n);
        for(int i=0;i<list.size()-2;i++)
        {
            if(list.get(i)+list.get(i+1)+list.get(i+2)==n)
            {
                return true;
            }
        }
        return false;
    }
    public static void fib(List<Integer> list, int n)
    {
        int first = 0;
        int second= 1;
        for(int i=2;i<n;i++)
        {
            if(second>=n)
            {
                break;
            }
            list.add(first);
            int next = first + second;
            first = second;
            second=next;
        }
    }
}