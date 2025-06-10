class Solution {
    public List<List<Integer>> generate(int numRows) {
        //List<Integer> list = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        for(int i = 1;i<= numRows;i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 1;j<=i;j++){
                list.add(NCRcombination(i-1, j-1));
            }
            finalList.add(list);
        }
        return finalList;
    }

    public int NCRcombination(int row, int col){
        int res = 1;
        for(int i=0;i<col;i++){
            res = res * (row-i);
            res = res / (i+1);
        }
        return res;
    }
}