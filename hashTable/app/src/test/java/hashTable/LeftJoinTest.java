package hashTable;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static hashTable.HashTable.leftJoin;
import static org.junit.jupiter.api.Assertions.*;
public class LeftJoinTest {
    @Test
    public void testLeftWithAllJoins(){
        HashMap h1 = new HashMap();
        h1.put("fond", "enamored");
        h1.put("wrath", "anger");
        h1.put("flow", "jam");

        HashMap h2 = new HashMap();
        h2.put("fond", "averse");
        h2.put("wrath", "delight");
        h2.put("flow", "test");


        assertEquals("[wrath: anger, delight, flow: jam, test, fond: enamored, averse]", leftJoin(h1, h2).toString());
    }

    @Test
    public void test_leftWithSomeJoins(){
        HashMap h1 = new HashMap();
        h1.put("fond", "enamored");
        h1.put("wrath", "anger");
        h1.put("diligent", "employed");
        h1.put("outfit", "garb");
        h1.put("guide", "usher");

        HashMap h2 = new HashMap();
        h2.put("fond", "averse");
        h2.put("wrath", "delight");
        h2.put("flow", "jam");


        assertEquals("[diligent: employed, null, outfit: garb, null, wrath: anger, delight, guide: usher, null, fond: enamored, averse]",leftJoin(h1, h2).toString());
    }

    @Test
    public void test_leftWithEmptySecondHashMap(){
        HashMap h1 = new HashMap();
        h1.put("fond", "enamored");
        h1.put("wrath", "anger");
        h1.put("diligent", "employed");
        h1.put("outfit", "garb");
        h1.put("guide", "usher");

        HashMap h2 = new HashMap();


        assertEquals("[diligent: employed, null, outfit: garb, null, wrath: anger, null, guide: usher, null, fond: enamored, null]", leftJoin(h1, h2).toString());

    }

    @Test
    public void test_leftBothEmptyHashMap(){
        HashMap h1 = new HashMap();
        HashMap h2 = new HashMap();
        

        assertEquals("[]", leftJoin(h1, h2).toString());

    }
}
