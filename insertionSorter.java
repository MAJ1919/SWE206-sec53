// Java program for implementation
// of Selection Sort

// Driver Class
class SelectionSort {
	public class InsertionSort {
	    
	    public static void insertionSort(int[] array) {
	        int n = array.length;
	        
	        for (int i = 1; i < n; i++) {
	            int key = array[i];
	            int j = i - 1;
	            
	            // Move elements of array[0..i-1] that are greater than key
	            // to one position ahead of their current position
	            while (j >= 0 && array[j] > key) {
	                array[j + 1] = array[j];
	                j--;
	            }
	            
	            array[j + 1] = key;
	        }
	    }
	    
	    public static void main(String[] args) {
	        // Example usage:
	        int[] arr = {12, 11, 13, 5, 6};
	        
	        System.out.println("Original Array:");
	        printArray(arr);
	        
	        insertionSort(arr);
	        
	        System.out.println("\nSorted Array:");
	        printArray(arr);
	    }
	    
	    public static void printArray(int[] array) {
	        for (int value : array) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }
	}

