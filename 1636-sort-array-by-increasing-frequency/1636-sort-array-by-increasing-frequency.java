class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> {
            if (map.get(a) != map.get(b)) {
                return map.get(a) - map.get(b);  
            }
            return b - a;
        });
        int[] arr = new int[nums.length];
        int index = 0;
        for (int num : list) {
            for (int i = 0; i < map.get(num); i++) {
                arr[index++] = num;
            }
        }
        return arr;
    }
}