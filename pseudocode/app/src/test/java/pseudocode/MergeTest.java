package pseudocode;

import org.junit.jupiter.api.Test;
import pseudocode.mergeSort.MergeSort;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeTest {

    @Test
    public void mergeSortTest1(){

        int [] mergeArr1 = {8, 4, 23, 42, 16, 15};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(mergeArr1);
        assertEquals("[4, 8, 15, 16, 23, 42]", Arrays.toString(mergeArr1));
    }

    @Test
    public void mergeSortTest2(){

        int [] mergeArr2 = {20, 18, 12, 8, 5, -2};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(mergeArr2);
        assertEquals("[-2, 5, 8, 12, 18, 20]",Arrays.toString(mergeArr2));
    }

    @Test
    public void mergeSortTest3(){

        int [] mergeArr3 = {5, 12, 7, 5, 5, 7};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(mergeArr3);
        assertEquals("[5, 5, 5, 7, 7, 12]",Arrays.toString(mergeArr3));
    }

    @Test
    public void mergeSortTest4(){

        int [] mergeArr4 = {2, 3, 5, 7, 13, 11,17};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(mergeArr4);
        assertEquals("[2, 3, 5, 7, 11, 13, 17]",Arrays.toString(mergeArr4));
    }

    @Test
    public void mergeSortTest5(){

        int [] mergeArr5 = {2};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(mergeArr5);
        assertEquals("[2]",Arrays.toString(mergeArr5));
    }
}
