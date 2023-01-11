package org.asvladimirov;

import org.asvladimirov.unionfind.QuickFind;
import org.asvladimirov.unionfind.QuickUnion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        unionFindAPITest();
    }

    public static void unionFindAPITest() {
        QuickFind quickFind = new QuickFind(10);
        quickFind.connect(0,5);
        quickFind.connect(0,6);
        System.out.println(quickFind.connected(5,6));

        QuickUnion quickUnion = new QuickUnion(10);
        quickUnion.connect(0,5);
        quickUnion.connect(0,6);
        System.out.println(quickUnion.connected(5,6));
    }
}
