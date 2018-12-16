package algorithm

import org.testng.Assert

object UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val unSortedArray = intArrayOf(6, 9, 2, 5, 1, 0, 4)
        val sortedArray = intArrayOf(0, 1, 2, 4, 5, 6, 9)
        //Create Sort object
        val sort = Sort()
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray)
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted")
        } catch (ex: Exception) {
            ex.message
        }

        //Now do for rest of the algorithm...................below


    }
}
