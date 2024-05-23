package org.example.f30.day34;

public class Number0008 {
    public static void main(String[] args) {
        String s = "   -042";
        Number0008 t = new Number0008();
        System.out.println(t.myAtoi(s));
    }

    public int myAtoi(String s) {
//        char[] chars = s.toCharArray();
//
//        int negative = 1;
//        int number = 0;
//        for (int i = 0; i < chars.length; i++) {
//            char c = chars[i];
//            if (c == ' ') {
//                continue;
//            } else if (c == '-') {
//                // 如果前面一个是不是空格
//                if (i != 0 && chars[i-1] != ' ' ) {
//                    number = 0;
//                    break;
//                }
//                negative = -1;
//            } else if (c == '0') {
//                continue;
//            } else if (!Character.isDigit(c)) {
//                break;
//            }
//            else {
//                number = number * 10 + c - '0';
//            }
//        }
//        if (negative < 0) {
//            number = -number;
//        }
//        if (number < 0) {
//            return number > Integer.MIN_VALUE / 10
//        }

        int n = s.length();
        int i = 0;
        // 记录正负号
        int sign = 1;
        // 用long避免int溢出
        long res = 0;
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i == n) {
            return 0;
        }

        // 记录符号位
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        if (i == n) {
            return 0;
        }

        // 统计数字位
        while (i < n && '0' <= s.charAt(i) && s.charAt(i) <= '9') {
            res = res * 10 + (s.charAt(i) - '0');
            if (res > Integer.MAX_VALUE) {
                break;
            }
            i++;
        }

        if ((int) res != res) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return (int) res * sign;
    }
}
