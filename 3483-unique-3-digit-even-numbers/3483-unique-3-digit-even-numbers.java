class Solution {
    public int totalNumbers(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] % 2 != 0) 
            {
                continue;
            }
            for (int j = 0; j < arr.length; j++) 
            {
                if (j == i) 
                {
                    continue;
                }
                for (int k = 0; k < arr.length; k++) 
                {
                    if (k == i || k == j) 
                    {
                        continue;
                    }
                    if (arr[k] == 0) 
                    {
                        continue;
                    }
                    int num = arr[k] * 100 + arr[j] * 10 + arr[i];
                    set.add(num);
                }
            }
        }
        return set.size();
    }
}
