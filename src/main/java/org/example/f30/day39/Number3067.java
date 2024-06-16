package org.example.f30.day39;

public class Number3067 {
    public static void main(String[] args) {
        Number3067 t = new Number3067();
        int[][] edges = {{0, 1, 1}, {1, 2, 5}, {2, 3, 13}, {3, 4, 9}, {4, 5, 2}};
        int signalSpeed = 1;
        int[] ints = t.countPairsOfConnectableServers(edges, signalSpeed);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public int[] countPairsOfConnectableServers(int[][] edges, int signalSpeed) {
        return null;
    }
}
