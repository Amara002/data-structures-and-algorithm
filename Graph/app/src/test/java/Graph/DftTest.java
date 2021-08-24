package Graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class DftTest {
    @Test
    public void depthFirstTest(){

        Graph graph3 = new Graph();

        graph3.addVertex("A");
        graph3.addVertex("B");
        graph3.addVertex("C");
        graph3.addVertex("D");


        graph3.addEdge("A", "D");
        graph3.addEdge("A", "B");
        graph3.addEdge("B", "D");
        graph3.addEdge("B", "C");

        assertEquals("[A, B, C, D]", graph3.dft("A").toString());
    }

    @Test
    public void depthFirstOneVertex(){

        Graph graph3 = new Graph();

        graph3.addVertex("A");

        assertEquals("[A]", graph3.dft("A").toString());
    }

    //    THIS TEST FOR THREE VERTICES AND ONE OF THEM DID NOT CONNECT WITH THE OTHER TWO VERTICES

    @Test
    public void depthFirstTest2(){

        Graph graph3 = new Graph();

        graph3.addVertex("A");
        graph3.addVertex("B");
        graph3.addVertex("C");

        graph3.addEdge("A", "B");

        assertEquals("[A, B]", graph3.dft("A").toString());
    }
}
