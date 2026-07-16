class Solution {
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];

        int maxI = 0;
        for (int i = 0; i < n; i++) {
            maxI = Math.max(maxI, nums[i]);
            prefix[i] = gcd(nums[i], maxI);
        }

        Arrays.sort(prefix);

        long result = 0;
        for (int i = 0; i < n / 2; i++) {
            result += gcd(prefix[i], prefix[n - 1 - i]);
        }

        return result;
    }
}