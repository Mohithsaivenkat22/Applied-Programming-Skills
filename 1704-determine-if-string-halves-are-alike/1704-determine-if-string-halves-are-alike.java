class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n / 2;
        int countA = 0, countB = 0;

        String vowels = "aeiouAEIOU";

        for (int i = 0; i < n; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                if (i < mid) {
                    countA++;
                } else {
                    countB++;
                }
            }
        }
        return countA == countB;
    }
}
