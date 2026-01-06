class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> hm = new HashMap<>();
        List<String> res = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return res;
        }
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");
        generateSequences(digits, 0, new StringBuilder(), hm, res);

        return res;
    }

    public void generateSequences(String digits, int idx, StringBuilder comb, HashMap<Character, String> hm, List<String> res){
        if(idx == digits.length()){
            res.add(comb.toString());
            return;
        }

        String letters = hm.get(digits.charAt(idx));
        for(char letter : letters.toCharArray()){
            comb.append(letter);
            generateSequences(digits, idx+1, comb, hm, res);
            comb.deleteCharAt(comb.length()-1);
        }
    }
}