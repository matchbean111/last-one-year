package org.example.f30.day35;

public class LCR177 {
    public static void main(String[] args) {
        int[] sockets = {4, 5, 2, 4};
        LCR177 t = new LCR177();
        int[] sockCollocation = t.sockCollocation(sockets);
        System.out.println(sockCollocation[0]);
        System.out.println(sockCollocation[1]);
    }

    /**
     * 位运算 技巧：
     * 0 &
     *
     * @param sockets 袜子编号
     * @return 撞色的一组
     */
    public int[] sockCollocation(int[] sockets) {
        int ret = 0;
        for (int n : sockets) {
            ret ^= n;
        }

        int div = 1;
        while ((div & ret) == 0) {
            div <<= 1;
        }
        int a = 0, b = 0;
        for (int n : sockets) {
            if ((div & n) != 0) {
                a ^= n;
            } else {
                b ^= n;
            }
        }
        return new int[]{a, b};
    }
}
