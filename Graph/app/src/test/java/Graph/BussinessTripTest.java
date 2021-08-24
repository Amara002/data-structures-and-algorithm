package Graph;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class BussinessTripTest {

    @Test
    public void businessTripTest(){

        Graph graph2 = new Graph();

        graph2.addVertex("Pandora");
        graph2.addVertex("Arendelle");
        graph2.addVertex("Metroville");
        graph2.addVertex("Monstroplolis");

        graph2.addEdgeWithWeight("Pandora", "Arendelle", 150);
        graph2.addEdgeWithWeight("Arendelle", "Metroville",99);
        graph2.addEdgeWithWeight("Arendelle", "Monstroplolis",42);

        List<String> cities1 = new ArrayList<>();
        cities1.add("Pandora");
        cities1.add("Arendelle");
        assertEquals(150, graph2.businessTrip(graph2, cities1));

        List<String> cities2 = new ArrayList<>();
        cities2.add("Pandora");
        cities2.add("Arendelle");
        cities2.add("Monstroplolis");
        assertEquals(192, graph2.businessTrip(graph2, cities2));

    }

    @Test
    public void businessTripNoEdge(){

        Graph graph2 = new Graph();

        graph2.addVertex("Pandora");
        graph2.addVertex("Arendelle");
        graph2.addVertex("Metroville");
        graph2.addVertex("Monstroplolis");

        graph2.addEdgeWithWeight("Pandora", "Arendelle", 150);
        graph2.addEdgeWithWeight("Arendelle", "Metroville",99);
        graph2.addEdgeWithWeight("Arendelle", "Monstroplolis",42);

        List<String> cities1 = new ArrayList<>();
        cities1.add("Pandora");
        cities1.add("Monstroplolis");
        assertEquals(0, graph2.businessTrip(graph2, cities1));
    }

    @Test
    public void businessTripAtLeastOnoEdge(){

        Graph graph2 = new Graph();

        graph2.addVertex("Pandora");
        graph2.addVertex("Arendelle");
        graph2.addVertex("Metroville");
        graph2.addVertex("Monstroplolis");
        graph2.addVertex("Naboo");

        graph2.addEdgeWithWeight("Pandora", "Arendelle", 150);
        graph2.addEdgeWithWeight("Arendelle", "Metroville",99);
        graph2.addEdgeWithWeight("Arendelle", "Monstroplolis",42);
        graph2.addEdgeWithWeight("Naboo", "Monstroplolis",42);


        List<String> cities1 = new ArrayList<>();
        cities1.add("Pandora");
        cities1.add("Naboo");
        cities1.add("Monstroplolis");
        assertEquals(42, graph2.businessTrip(graph2, cities1));
    }

}
