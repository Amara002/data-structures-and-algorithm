# data-structures-and-algorithm

## Hashtables
***The Hashtable class implements a hash table, which maps keys to values. Any non-null object can be used as a key or as a value. To successfully store and retrieve objects from a hashtable, the objects used as keys must implement the hashCode method and the equals method.***  

#### Features of Hashtable

* It is similar to HashMap, but is synchronized.
* Hashtable stores key/value pair in hash table.
* In Hashtable we specify an object that is used as a key, and the value we want to associate to that key. The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.
* The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
* HashMap doesn’t provide any Enumeration, while Hashtable provides not fail-fast Enumeration.


### Challenge
**Create Hash Table class**

### Approach & Efficiency
> Big O,,, time <-- O(n),,, space<-- O(n)

### API
***Methods of Hashtable***

* K – The type of the keys in the map.
* V – The type of values mapped in the map.

|         METHOD         |        DESCRIPTION                                                                                             |
|------------------------|----------------------------------------------------------------------------------------------------------------|
| contains(Object value) |  Tests if some key maps into the specified value in this hashtable.                                            |
|      get(K key)        |  Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.  |
|      isEmpty()         |  Tests if this hashtable maps no keys to values.                                                               |
|    remove(K key)       |  Removes the key (and its corresponding value) from this hashtable.                                            |
	
 	
