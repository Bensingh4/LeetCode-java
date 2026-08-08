class Solution {
    public int mostWordsFound(String[] sentences) {
        int c = 0;

        for (String sentence : sentences) {
            int count = 0;

            for (char ch : sentence.toCharArray()) {
                if (ch == ' ') {
                    count++;
                }
            }

            c = Math.max(c, count + 1);
        }

        return c;
    }
}