class Solution {

    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        // Arrays to remember which rows and columns should become zero
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        // First Pass: Find all original zeros
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }

            }
        }

        // Second Pass: Make the required rows and columns zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }

            }
        }
    }
}