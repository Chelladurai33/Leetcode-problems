class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
          permutation(nums, 0,list);
        return list;
    }
     static void permutation(int[] arr, int index, List<List<Integer>> list) {
        if (index == arr.length) {
           List<Integer> temp=new ArrayList<>();
           for(int i:arr)
           {
            temp.add(i);
           }
           list.add(temp);
            return;
        }
        for (int i = index; i < arr.length; i++) {
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            permutation(arr, index + 1,list);
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}