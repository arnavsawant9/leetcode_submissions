class Solution {
    public int findClosest(int x, int y, int z) {
        int dist13 = z - x;
        if(dist13 < 0) { dist13 = dist13*-1; }
        int dist23 = z - y;
        if(dist23 < 0) { dist23 = dist23*-1; }
        if(dist13 < dist23){
            return 1;
        } else if(dist23 < dist13){
            return 2;
        }
        return 0;
    }
}