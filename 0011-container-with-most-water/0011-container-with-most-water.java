class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            // Find the width
            int width = right - left;

            // Height of water is the smaller of the two bars
            int h = Math.min(height[left], height[right]);

            // Calculate area
            int area = width * h;

            // Update maximum area
            maxArea = Math.max(maxArea, area);

            // Move the pointer with the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}