package org.example.easy;

public class N1689 {
    public static void main(String[] args) {
        N1689 n1689 = new N1689();
        int i = n1689.minPartitions("82734");
        System.out.println(i);
    }

    public int minPartitions(String n) {
        return n.length() - 1;
    }
}
