class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<grid.length;i++){
            String s="";
            for(int j=0;j<grid[0].length;j++){
                s=s+grid[i][j]+",";
            }
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int count=0;
        for(int i=0;i<grid.length;i++){
            String s="";
            for(int j=0;j<grid[0].length;j++){
                s=s+grid[j][i]+",";
            }
            count+=map.getOrDefault(s,0);
        }
        return count;
    }
}