

public class LongPalinSub {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() <= 1)
            return s;

        int n = s.length();
        int maxLen = 1;
        boolean[][] dp = new boolean[n][n];

        String longest = null;
        for (int l = 0; l < s.length(); l++) {
            for (int i = 0; i < n - l; i++) {
                int j = i + l;
                if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;

                    if (j - i + 1 > maxLen) {
                        maxLen = j - i + 1;
                        longest = s.substring(i, j + 1);
                    }
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        String s = "abcbacad";
        //           
        System.out.println(longestPalindrome(s));
        System.out.println("This is our result!");
    }
}

