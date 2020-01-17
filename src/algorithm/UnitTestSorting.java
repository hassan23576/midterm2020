package algorithm;

import org.testng.Assert;

import java.util.Arrays;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.

        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            int [] actual = sort.selectionSort(unSortedArray);
            Assert.assertEquals(actual,sortedArray);
            System.out.println("Selection test passed");
        }catch(AssertionError ex){
            System.out.println("Selection test failed");
        }

        //Now implement Unit test for rest of the soring algorithm...................below

        //verify if the unsorted array is sorted by the Insertion sort algorithm.
        try {
            int [] actual = sort.insertionSort(unSortedArray);
            Assert.assertEquals(actual,sortedArray);
            System.out.println("Insertion test passed");
        }catch(AssertionError ex){
            System.out.println("Insertion test failed");
        }

        //verify if the unsorted array is sorted by the Bubble sort algorithm.
        try {
            int [] actual = sort.bubbleSort(unSortedArray);
            Assert.assertEquals(actual,sortedArray);
            System.out.println("Bubble test passed");
        }catch(AssertionError ex){
            System.out.println("Bubble test failed");
        }

        //verify if the unsorted array is sorted by the Merge sort algorithm.
        try {
            int [] actual = sort.mergeSort(unSortedArray);
            Assert.assertEquals(actual,sortedArray);
            System.out.println("Merge test passed");
        }catch(AssertionError ex){
            System.out.println("Merge test failed");
        }

        //verify if the unsorted array is sorted by the quick sort algorithm.
        try {
            int [] actual = sort.quickSort(unSortedArray);
            Assert.assertEquals(actual,sortedArray);
            System.out.println("Quick test passed");
        }catch(AssertionError ex){
            System.out.println("Quick test failed");
        }

        //verify if the unsorted array is sorted by the heap sort algorithm.
        try {
            int [] actual = sort.heapSort(unSortedArray);
            Assert.assertEquals(actual,sortedArray);
            System.out.println("Heap test passed");
        }catch(AssertionError ex){
            System.out.println("Heap test failed");
        }

        //verify if the unsorted array is sorted by the bucket sort algorithm.
        try {
            int [] actual = sort.bucketSort(unSortedArray);
            Assert.assertEquals(actual,sortedArray);
            System.out.println("Bucket test passed");
        }catch(AssertionError ex){
            System.out.println("Bucket test failed");
        }

        //verify if the unsorted array is sorted by the shell sort algorithm.
        try {
            int [] actual = sort.shellSort(unSortedArray);
            Assert.assertEquals(actual,sortedArray);
            System.out.println("Shell test passed");
        }catch(AssertionError ex){
            System.out.println("Shell test failed");
        }
    }
}
