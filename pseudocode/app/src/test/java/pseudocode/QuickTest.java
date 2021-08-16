package pseudocode;

import org.junit.jupiter.api.Test;
import pseudocode.quickSort.QuickSort;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public class QuickTest {

    @Test
    public void quickTest1(){

        int[] quickSortArr1 = {8, 4, 23, 42, 16, 15};
        QuickSort quickSort = new QuickSort();

        quickSort.quickSort(quickSortArr1,0,5);
        assertEquals("[4, 8, 15, 16, 23, 42]", Arrays.toString(quickSortArr1));
    }

    @Test
    public void quickTest2(){

        int[] quickSortArr2 = {20, 18, 12, 8, 5, -2};
        QuickSort quickSort = new QuickSort();

        quickSort.quickSort(quickSortArr2,0,5);
        assertEquals("[-2, 5, 8, 12, 18, 20]", Arrays.toString(quickSortArr2));
    }

    @Test
    public void quickTest3(){

        int[] quickSortArr3 = {5, 12, 7, 5, 5, 7};
        QuickSort quickSort = new QuickSort();

        quickSort.quickSort(quickSortArr3,0,5);
        assertEquals("[5, 5, 5, 7, 7, 12]", Arrays.toString(quickSortArr3));
    }

    @Test
    public void quickTest4(){

        int[] quickSortArr4 = {2, 3, 5, 7, 13, 11,17};
        QuickSort quickSort = new QuickSort();

        quickSort.quickSort(quickSortArr4,0,5);
        assertEquals("[2, 3, 5, 7, 11, 13, 17]", Arrays.toString(quickSortArr4));
    }

    @Test
    public void quickTest5(){

        int[] quickSortArr5 = {2};
        QuickSort quickSort = new QuickSort();

        quickSort.quickSort(quickSortArr5,0,5);
        assertEquals("[2]", Arrays.toString(quickSortArr5));
    }
}
