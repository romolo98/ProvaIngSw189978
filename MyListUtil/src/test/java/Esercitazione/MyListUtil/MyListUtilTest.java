package Esercitazione.MyListUtil;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest 
{
    private static MyListUtil test;
    
    @BeforeClass
    public static void Inizialize () {
    	test = new MyListUtil();
    	test.riempiArray();
    }
    
    @Test
    public void TestSortCrescente () {
    	test.SortCrescente();
    	for (int i=0;i<test.getArray().size()-1;i++) {
    		assertTrue(test.getArray().get(i) < test.getArray().get(i+1));
    	}
    }
    @Test
    public void TestSortDecrescente () {
    	test.SortDecrescente();
    	for (int i=0;i<test.getArray().size()-1;i++) {
    		assertTrue(test.getArray().get(i) > test.getArray().get(i+1));
    	}
    }
}
