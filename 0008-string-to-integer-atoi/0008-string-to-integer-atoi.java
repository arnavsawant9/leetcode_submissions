class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;

        int i = 0;
        int n = s.length();
        
        // skippp all the white spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        // keep a check whether we have reached till the end or not
        if (i == n) {
            return 0;
        }
        
        // check for the sign whether it is +ve or -ve
        int sign = 1;
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        
        // read the digits and convert them to the number
        long res = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            res = res * 10 + digit;
            
            if (sign * res <= INT_MIN) {
                return INT_MIN;
            }
            if (sign * res >= INT_MAX) {
                return INT_MAX;
            }
            
            i++;
        }
        
        // return the answer!!!
        return (int)(res * sign);        
    }
}