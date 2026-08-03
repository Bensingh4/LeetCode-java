class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = new int[n + 1];  // dp[n] = 0 by default
        
        // Build dp from the back of the array
        for (int i = n - 1; i >= 0; i--) {
            int best = Integer.MIN_VALUE;
            int total = 0;
            for (int k = 1; k <= 3; k++) {  // take 1, 2, or 3 stones
                if (i + k - 1 < n) {
                    total += stoneValue[i + k - 1];
                    best = Math.max(best, total - dp[i + k]);
                }
            }
            dp[i] = best;
        }
        
        if (dp[0] > 0) return "Alice";
        else if (dp[0] < 0) return "Bob";
        else return "Tie";
    }
}