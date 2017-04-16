/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import mz.com.osoma.aed.CLinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author feler
 */
public class UnitTest {

    public UnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test() {

        CLinkedList theList = new CLinkedList();

        theList.adiciona(1);
        theList.adiciona(2);
        theList.adiciona(3);
        theList.adiciona(4);
        System.out.println(theList);

        theList.remove();
        System.out.println(theList);
        theList.remove();
        System.out.println(theList);
    }
}
