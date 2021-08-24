# data-structures-and-algorithm

## Challenge
***Implement a graph with these method:***

* AddNode()
* AddEdge()
* GetNodes()
* GetNeighbors()
* Size()

## Approach & Efficiency
* AddVertex(): it is O(1) for both time and space complexity, since we are adding one Vertex to the adjacent list for graph.
* AddEdge(): it is O(1) for both time and space complexity, since we are adding one edge to the adjacent list for graph.
* GetVertiecs(): it is O(1) for both time and space complexity, since we are returning a set of vertex.
* GetNeighbors(): it is O(n) for both time complexity and space complexity, since we will take a Vertex as input and iterate through the set of vertexes to see the neighbors.
* Size(): it is O(n) for time complexity and O(1) for space complexity, since we will iterate through all nodes to get the size and return only one value.

## API
* AddVertex(): 

Adds a new Vertex to the graph. Takes in the value of that Vertex. Returns the added Vertex

* GetVertiecs(): 

Returns all of the Vertiecs in the graph as a collection (set, list, or similar)

* GetNeighbors(): 

Returns a collection of edges connected to the given Vertex. Takes in a given Vertex. 

* Size(): 

Returns the total number of Vertiecs in the graph

