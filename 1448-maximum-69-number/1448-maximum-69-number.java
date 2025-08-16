class Solution {
    public int maximum69Number (int num) {
        int[] digits = String.valueOf(num)
                    .chars() 
                    .map(c -> c - '0')
                    .toArray();
        boolean changed = false;
        for(int i=0;i<digits.length;i++){
            if(digits[i] == 6 && !changed){
                digits[i] = 9;
                changed = true;
            }
        }

        int res = 0;
        for (int d : digits) {
            res = res * 10 + d;
        }
        return res;
    }
}