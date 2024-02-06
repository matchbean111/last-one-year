package org.example.f10.day07;

public class Number0151 {
    public static void main(String[] args) {
        String s = "   the sky is blue    ";
        String r = reverseWords(s);
        System.out.println(r);
    }

    /**
     * 学到了while(left <right){
     *     while (left < right && something ...){
     *         继续搜索
     *     }
     *     some other code
     *     while (left < right && other something) {
     *         ...;
     *     }
     * }
     * @param s
     * @return
     */
    private static String reverseWords(String s) {
        StringBuilder sb = trimSpace(s);
        reverse(sb, 0, sb.length() - 1);
        reverseEachWord(sb);
        return sb.toString();
    }

    private static void reverseEachWord(StringBuilder sb) {
        int n = sb.length();
        int start = 0;
        int end = 0;
        while (start < n) {
            while (end < n && sb.charAt(end) != ' ') {
                end++;
            }
            reverse(sb, start, end - 1);
            start = end + 1;
            end++;
        }
    }

    public static void reverse(StringBuilder sb, int left, int right) {
        while (left < right) {
            char tmp = sb.charAt(left);
            sb.setCharAt(left++, sb.charAt(right));
            sb.setCharAt(right--, tmp);
        }
    }

    private static StringBuilder trimSpace(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right && s.charAt(left) == ' ') {
            left++;
        }
        while (left <= right && s.charAt(right) == ' ') {
            right--;
        }
        StringBuilder sb = new StringBuilder();
        while (left <= right) {
            char c = s.charAt(left);
            if (c != ' ') {
                sb.append(c);
            } else if (sb.charAt(sb.length() - 1) != ' ') {
                sb.append(c);
            }
            left++;
        }
        System.out.println(sb);
        System.out.println(12);
        return sb;
    }
}
