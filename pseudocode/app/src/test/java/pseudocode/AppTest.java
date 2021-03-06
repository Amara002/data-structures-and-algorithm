/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pseudocode;

import org.junit.jupiter.api.Test;
import pseudocode.insertionSort.InsertionSort;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test
    public void insertionSortTest1(){
        int[] arr1 = {8, 4, 23, 42, 16, 15};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr1);
        assertEquals("[4, 8, 15, 16, 23, 42]", Arrays.toString(arr1));
    }
    @Test
    public void insertionSortTest2(){

        int [] arr2 ={20, 18, 12, 8, 5, -2};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr2);
        assertEquals("[-2, 5, 8, 12, 18, 20]", Arrays.toString(arr2));

    }

    @Test
    public void insertionSortTest3(){
        int [] arr3 = {5, 12, 7, 5, 5, 7};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr3);
        assertEquals("[5, 5, 5, 7, 7, 12]", Arrays.toString(arr3));

    }

    @Test
    public void insertionSortTest4(){
        int [] arr4 = {2, 3, 5, 7, 13, 11};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr4);
        assertEquals("[2, 3, 5, 7, 11, 13]", Arrays.toString(arr4));

    }
}
