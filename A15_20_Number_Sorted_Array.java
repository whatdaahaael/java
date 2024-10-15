/**
 * Write a program in java to store 10 numbers, each in two different
 * Single Dimensional Array. Arrange them in unascending order and
 * merge all the numbers of the array into a single sorted array after
 * elimination the duplicate numbers. Display the sorted array.
 * Sujan
 * Assignment 15
 */

public class A15_20_Number_Sorted_Array {
    int arr1[], arr2[];
    A15_20_Number_Sorted_Array() {
        arr1= new int[10];
        arr2= new int[10];
    }
    /**
     * This Function is used to set the array values
     * from 'a', 'b' to 'arr1', 'arr2' respectively.
     *
     * @param a first array
     * @param b second array
     */
    void set_array_values(int a[], int b[]) {
        // Copying values of 'a[]' to 'arr1[]'
        for(int i=0; i<a.length;i++) {
            arr1[i] = a[i];
        }

        // Copying values of 'b[]' to 'arr2'
        for(int i=0; i<b.length;i++) {
            arr2[i] = b[i];
        }
    }
    /**
     * This Function is used to merge the two arrays,
     * 'arr1' and 'arr2' to form a new 'merged_arr'.
     *
     * @return an array that is merged.
     */
    int[] arr_merge() {
        int arr[] = new int[arr1.length+arr2.length];
        /*
         * 'arr_ctr' it keeps track of the position...
         * It is used so that the second array, 'arr2' starts where
         * 'arr1' postion+1 ends.
         */
        int arr_ctr=0;

        // 'arr1'
        for(int i=0; i<arr1.length;i++) {
            arr[arr_ctr] = arr1[i];
            arr_ctr++;
        }

        // 'arr2'
        for (int i = 0; i < arr2.length; i++) {
            arr[arr_ctr] = arr2[i];
            arr_ctr++;
        }

        return arr;
    }
    /**
     * This Function is used to sort the merged array.
     *
     * It first calls the 'arr_merge' method to merge the two arrays,
     * 'arr1' and 'arr2' and assigns the return value to 'arr_merged'
     * and then sorts their position in descending order, using 'bubble
     * sort' technique and then sends the sorted array to
     * 'arr_remove_duplicates(arr_merged)' to remove all the duplicates
     * in the 'arr_merged'.
     *
     * @return the value to be printed.
     */
    int[] arr_sort(){
        int arr_merged[]=arr_merge();
        // Sorting the array using 'Bubble Sort Technique'
        for (int i = 0; i < arr_merged.length-1; i++) {
            for (int j = 0; j < arr_merged.length-i-1; j++) {
                if(arr_merged[j]<arr_merged[j+1]) {
                    int temp = arr_merged[j];
                    arr_merged[j]=arr_merged[j+1];
                    arr_merged[j+1]=temp;
                }
            }
        }
        return arr_remove_duplicates(arr_merged);
    }
    /**
     * This Function is used to remove the duplicates in the
     * 'arr_merged'.
     *
     * @param arr_merged the merged array
     * @return the final array to be printed.
     */
    int[] arr_remove_duplicates(int arr_merged[]){
        int final_arr[] = new int[arr_merged.length];
        // 'pos' is used to keep track of the UNIQUE NUMBERS.
        int pos=0;
        int am_len = arr_merged.length;

        // Removing of duplicates...
        for (int i = 0; i < am_len-1; i++) {
            /*
             * If the number at 'arr_merged[i]' is not equal to 'arr_merged[i + 1]'
             * then it assigns it to 'pos' and increasing its value by 1...
             * so that if its false, the position does not change...
             */
            if (arr_merged[i] != arr_merged[i + 1]) {
                final_arr[pos++] = arr_merged[i];
            }
        }
        // assigning the final value as it won't be reached during the for loop
        final_arr[pos] = arr_merged[am_len-1];

        return final_arr;
    }
    /**
     * This Function is used to print the Final Array
     *
     * @param final_array The array obtained after merging, sorting and removing duplicates
     *                    present in 'arr1' and 'arr2'.
     */
    void print_array_values(int final_array[]) {
        // Printing the Values
        for (int i = 0; i < final_array.length; i++) {
            // If the number is not a zero then print it.
            if(final_array[i]!=0) {
                System.out.println(final_array[i]);
            }
        }
    }
    public static void main(String args[]) {

        int a[] = {49, 61, 69, 31, 40, 55, 94, 25, 15, 50};
        int b[] = {90, 30, 22, 97, 55, 38, 49, 52, 67, 61};

        // Declaring the object of the class as 'obj'
        A15_20_Number_Sorted_Array obj = new A15_20_Number_Sorted_Array();

        // Assigning the values
        obj.set_array_values(a, b);

        // Merging, Sorting, Removing duplicates and Printing the Values.
        obj.print_array_values(obj.arr_sort());

    }
}