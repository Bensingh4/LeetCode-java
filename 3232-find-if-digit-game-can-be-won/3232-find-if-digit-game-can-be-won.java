class Solution {
    public boolean canAliceWin(int[] nums) {

        int oneDigitSum = 0;
        int twoDigitSum = 0;

        for (int num : nums) {

            if (num < 10) {
                oneDigitSum += num;
            } else {
                twoDigitSum += num;
            }
        }

        return oneDigitSum != twoDigitSum;
    }
}