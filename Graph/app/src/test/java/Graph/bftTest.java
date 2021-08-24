package Graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class bftTest {

    @Test
    public void breadthFirst(){

        Graph graph1 = new Graph();

        graph1.addVertex("Pandora");
        graph1.addVertex("Arendelle");
        graph1.addVertex("Metroville");
        graph1.addVertex("Monstroplolis");
        graph1.addVertex("Narnia");
        graph1.addVertex("Naboo");

        graph1.addEdge("Pandora", "Arendelle");
        graph1.addEdge("Arendelle", "Metroville");
        graph1.addEdge("Arendelle", "Monstroplolis");
        graph1.addEdge("Metroville", "Narnia");
        graph1.addEdge("Metroville", "Naboo");
        graph1.addEdge("Metroville", "Monstroplolis");
        graph1.addEdge("Monstroplolis", "Naboo");
        graph1.addEdge("Narnia", "Naboo");

        assertEquals("[Pandora, Arendelle, Metroville, Monstroplolis, Narnia, Naboo]", graph1.bft("Pandora").toString());
    }

    @Test
    public void breadthFirstOneVertex(){

        Graph graph1 = new Graph();

        graph1.addVertex("Pandora");
        graph1.addEdge("Pandora", "Pandora");

        assertEquals("[Pandora]",graph1.bft("Pandora").toString());
    }

    //    THIS TEST FOR THREE VERTICES AND ONE OF THEM DID NOT CONNECT WITH THE OTHER TWO VERTICES
    @Test
    public void breadthFirstTest(){

        Graph graph1 = new Graph();

        graph1.addVertex("Pandora");
        graph1.addVertex("Arendelle");
        graph1.addVertex("Metroville");

        graph1.addEdge("Pandora", "Arendelle");

        assertEquals("[Pandora, Arendelle]",graph1.bft("Pandora").toString());
    }
}
