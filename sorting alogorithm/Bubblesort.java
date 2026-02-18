
public class Bubblesort {  
    public static void main(String[] args) {  
        // int arr[] = {3, 60, 35, 2, 45, 320, 5}; 
        int arr[] = {1,2,3,5,4}; 
        int n = arr.length;  
        bubbleSort(arr, n);  
        System.out.println("Sorted array:");  
        printArray(arr);  
    }  
  
    static void bubbleSort(int arr[], int n) { 
        int count = 0; 
        for (int i = 0; i < n - 1; i++) {  
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) { 
                
                if (arr[j] < arr[j + 1]) {  
                    // swap arr[j] and arr[j+1]  
                    int temp = arr[j];  
                    arr[j] = arr[j + 1];  
                    arr[j + 1] = temp;  
                    swapped = true;
                }  
                count++;
            }  
            if(!swapped){
                break;
            }
        }  
        System.out.println("Total number of comparisons: " + count);
    }  
  
    static void printArray(int arr[]) {  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
    }     
}

// Time complexity: O(n^2) in the worst and average case, O(n) in the best case (when the array is already sorted).
// Space complexity: O(1) because it is an in-place sorting algorithm.