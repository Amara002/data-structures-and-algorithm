package tree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FizzBussTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test
    public void kTreeFizzBuzzTest(){

        KAryTree kAryTree = new KAryTree(2);

        kAryTree.add(1);
        kAryTree.add(2);
        assertEquals("K-ary tree (K=2): {\n" +
                " root={value= 1\n" +
                "Children: [\n" +
                " child: {value= 2\n" +
                "Children: []]\n" +
                "nodes=2}",kAryTree.fizzBuzzTree(kAryTree).toString() );

        kAryTree.add(3);
        assertEquals("K-ary tree (K=2): {\n" +
                " root={value= 1\n" +
                "Children: [\n" +
                " child: {value= 2\n" +
                "Children: []\n" +
                " child: {value= Fizz\n" +
                "Children: []]\n" +
                "nodes=3}", kAryTree.fizzBuzzTree(kAryTree).toString());

        kAryTree.add(5);
        assertEquals("K-ary tree (K=2): {\n" +
                " root={value= 1\n" +
                "Children: [\n" +
                " child: {value= 2\n" +
                "Children: [\n" +
                " child: {value= Buzz\n" +
                "Children: []]\n" +
                " child: {value= Fizz\n" +
                "Children: []]\n" +
                "nodes=4}", kAryTree.fizzBuzzTree(kAryTree).toString());

        kAryTree.add(15);
        assertEquals("K-ary tree (K=2): {\n" +
                " root={value= 1\n" +
                "Children: [\n" +
                " child: {value= 2\n" +
                "Children: [\n" +
                " child: {value= Buzz\n" +
                "Children: []\n" +
                " child: {value= FizzBuzz\n" +
                "Children: []]\n" +
                " child: {value= Fizz\n" +
                "Children: []]\n" +
                "nodes=5}", kAryTree.fizzBuzzTree(kAryTree).toString());

    }
}
