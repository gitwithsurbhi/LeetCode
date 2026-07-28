class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1)return s;
     int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        char middle = 0;

        for (int i = 0; i < 26; i++) {
            // add half of each character to left side
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char)('a' + i));
            }
            // if odd frequency, candidate for middle
            if (freq[i] % 2 == 1 && middle == 0) {
                middle = (char)('a' + i);
            }
        }

        StringBuilder ans = new StringBuilder(left);
        if (middle != 0) ans.append(middle);
        ans.append(left.reverse());

        return ans.toString();
    }
}