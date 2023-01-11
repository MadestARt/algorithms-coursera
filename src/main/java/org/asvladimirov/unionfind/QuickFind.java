package org.asvladimirov.unionfind;

public class QuickFind {
    private int[] id;

    public QuickFind(int arrayLength) {
        id = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p,int q) {
        return id[p] == id[q];
    }

    public void connect(int p,int q){
        int pId = id[p];
        int qId = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pId) id[i] = qId;
        }
    }

}