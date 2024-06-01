package org.example.easy;

public class LCR182 {
    public static void main(String[] args) {
        LCR182 t = new LCR182();
        String password = "s3cur1tyC0d3";
        int target = 4;
        String pwd = t.dynamicPassword(password, target);
        System.out.println(pwd);
    }

    public String dynamicPassword(String password, int target) {
        StringBuilder sb = new StringBuilder();
        sb.append(password.substring(target));
        sb.append(password.substring(0, target));
        return sb.toString();
    }
}
