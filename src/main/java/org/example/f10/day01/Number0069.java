package org.example.f10.day01;

public class Number0069 {
    public static void main(String[] args) {
        int x = 19;
        int a = mySqrt(x);
        System.out.println(a);
    }

    private static int mySqrt(int x) {
        int l =0;
        int r = x;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r-l)/2;
            if ((long)mid * mid <= x){
                ans = mid;
                l = mid + 1;
            }else {
                r= mid-1;
            }
        }
        return ans;

    }
}
