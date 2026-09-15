class Solution {
    
    public int maxPalindromes(String s, int k) 
       {
        int n = s.length();
        boolean[][] isPal = new boolean[n][n];

        // Precompute palindromes
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;
                if (len == 1) {
                    isPal[i][j] = true;
                } else if (len == 2) {
                    isPal[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    isPal[i][j] = (s.charAt(i) == s.charAt(j)) && isPal[i+1][j-1];
                }
            }
        }

        int[] dp = new int[n+1]; // dp[i] = max palindromes in s[0..i-1]

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i-1]; // skip current char
            for (int j = i-k; j >= 0; j--) {
                if (isPal[j][i-1] && i-j >= k) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    break; // greedy: take earliest valid palindrome
                }
            }
        }

        return dp[n];
    }
}