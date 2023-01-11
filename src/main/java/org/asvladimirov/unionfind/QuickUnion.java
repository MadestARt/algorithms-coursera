package org.asvladimirov.unionfind;

public class QuickUnion {
    private int[] id;

    public QuickUnion(int arrayLength) {
        id = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            id[i] = i;
        }
    }

    private int root(int p) {
        while (id[p] != p) {
            p = id[p];
        }
        return p;
    }

    public boolean connected(int p,int q) {
        return root(p) == root(q);
    }

    public void connect(int p,int q) {
        var pRoot = root(p);
        var qRoot = root(q);
        id[pRoot] = qRoot;
    }
}
