# data-structures-and-algorithm

# Trees
* ***A Tree is a non-linear data structure where data objects are organized in terms of hierarchical relationship.***
* ***Data structure are used to store and organize data. We can use algorithms to manipulate and use our data structures. Different types of data are organized more efficiently by using different data structures.***

## Challenge
***This challenge was how to build bianry tree class that stores nodes according to three types preOrder, inOrder and postOrder. Then, how to build binary tree search
that contains add() and contain() methods.***

## Approach & Efficiency
***It took around four hours to get the Idea. The big O was O(n) for every method that I used.***


### Methods in Binary Tree class

* postOrder(Node node): stores the nodes in array list by following this rule `left >> right >> root way`.

* inOrder(Node node ): stores the nodes in array list by following this rule `left >> root >> right way`.

* preOrder(Node node): stores the nodes in array list by following this rule `root >> left >> right way`.

 ### Methods in Binary Search Tree class

* add(int key): Adds a new node and its value in the correct place in the binary search tree.

* contains(int key): Returns boolean if the value exist or not.

* traverse (Node current, int key): Check the value that we added through add() method if it was in the right place.
