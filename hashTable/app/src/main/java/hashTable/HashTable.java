package hashTable;

import hashTable.BinaryTree.BinaryTree;
import hashTable.BinaryTree.Node;

import java.util.*;

public class HashTable<K, V> {


    // bucket of hashnodes used to store linked list of
    // hashnodes in each bucket when collisions occur
    private ArrayList<HashNode<K, V>> bucketArray;

    // will hold the current size of our bucketArray
    private int numBuckets;

    // will hold the total number of hashnodes in the bucket array
    private int size;

    public HashTable() {
        bucketArray = new ArrayList<>();
        numBuckets = 30;
        size = 0;

        // create bucket array
        for (int index = 0; index < numBuckets; index++) {
            bucketArray.add(null);
        }
    }

    /**
     * hashes the key using the built in java hash function,
     * however you can build your own
     *
     * @param key any object
     * @return hashcode of the key
     */
    private int hashCode(K key) {
        return Objects.hashCode(key);
    }

    /**
     * Gets the index of where the value is located in the bucket array
     *
     * @param key any object
     * @return bucket index
     */
    private int getBucketIndex(K key) {
        int hashCode = hashCode(key);

        // this is to ensure the index is with in the bounds of the bucket array
        int index = hashCode % numBuckets;

        // hashCode can be negative (key.hashCode() can be -ve (negative))
        // so we need to make it positive
        index = index < 0 ? index * -1 : index;

        return index;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    /**
     * @param key
     * @param value
     */
    public void add(K key, V value) {

        // gets the head of a linked list for a given key
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // check if key present
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                head.value = value;
                return;
            }

            head = head.next;
        }

        // insert the value in to the position
        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<>(key, value, hashCode);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);

        // if the load factor (number of hasnnodes) goes beyond the threshold
        // double the hashtble aka the bucket array
        if ((1.0 * size) / numBuckets >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            size = 0;

            for (int index = 0; index < numBuckets; index++) {
                bucketArray.add(null);
            }

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    /**
     * @param key
     * @return
     */
    public V remove(K key) {
        // Apply hash function to find index for given key
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        // Get head of chain
        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // Search for key in its linked list
        HashNode<K, V> prev = null;
        while (head != null) {
            // If Key found
            if (head.key.equals(key) && hashCode == head.hashCode)
                break;

            // Else keep moving in chain
            prev = head;
            head = head.next;
        }

        // If key was not there
        if (head == null)
            return null;

        // Reduce size
        size--;

        // Remove key
        if (prev != null)
            prev.next = head.next;
        else
            bucketArray.set(bucketIndex, head.next);

        return head.value;
    }

    /**
     * @param key
     * @return
     */
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // search the linnked list
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                return head.value;
            }

            head = head.next;
        }

        // key not found
        return null;
    }

    public boolean contains(K key) {
        if (key == null) {
            throw new IllegalArgumentException("Cannot find a null key.");
        }
        return get(key) != null;
    }

    public String repeatedWord(String strings) {

        String allWords = strings.toLowerCase(Locale.ROOT);
        String[] token = allWords.split(" ");
        HashTable<String, Integer> hashMap = new HashTable<String, Integer>();


        for (String word : token) {

            if (word.contains(",")) {
                word = word.substring(0, word.length() - 1);
            }

            if (!word.equals("")) {

                int count = hashMap.get(word) != null ? hashMap.get(word) : 0;

                if (count == 1) {
                    return word;
                }
                hashMap.add(word, count + 1);
            }
        }

        return "no repeated words";
    }

    //    code challenge 32
    public HashMap<Integer, Integer> hashMap = new HashMap<>();
    public List<Integer> intersections = new ArrayList<>();

    public List<Integer> treeIntersection(BinaryTree tree1, BinaryTree tree2) {

        if (tree1.getRoot() == null || tree2.getRoot() == null) {
            return null;
        }

        traverse(tree2.getRoot());

        compare(tree1.getRoot());

        return intersections;
    }

    public void traverse(Node node) {

        if (node != null) {

            int count = 0;
            if (hashMap.get(node.getKey()) == null) {
                count = 1;
            } else {
                count = count + 1;
            }

            hashMap.put(node.getKey(), count);

            traverse(node.getLeft());
            traverse(node.getRight());
        }
    }

    public void compare(Node node) {
        if (node != null) {
            if (hashMap.get(node.getKey()) != null) {
                intersections.add(node.getKey());
            }
            compare(node.getLeft());
            compare(node.getRight());
        }

    }

    //    codeChallege 33
    public static List<String> leftJoin(HashMap h1, HashMap h2) {

        List<String> list = new ArrayList<>();
        for (Object k : h1.keySet()) {
            if (h1.containsKey(k)) {
                list.add(k + ": " + h1.get(k) + ", " + h2.get(k));
            } else {
                list.add(k + ": " + h1.get(k) + ", " + null);
            }
        }

        return list;
    }
}
