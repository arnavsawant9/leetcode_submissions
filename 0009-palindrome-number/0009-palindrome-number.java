class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int reverse_number = 0;
        while(num>0){
            int y = num % 10;
            reverse_number = reverse_number*10 + y;
            num = num/ 10;
        }

        if(x == reverse_number){
            return true;
        } else {
            return false;
        }
    }
}