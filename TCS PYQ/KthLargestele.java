import java.util.Collections;
import java.util.TreeSet;

public class KthLargestele {
    
    public static int findKthLargestDistinct(int[] arr, int k) {
        // Use TreeSet to store unique elements in descending order
        TreeSet<Integer> uniqueElements = new TreeSet<>(Collections.reverseOrder());
        
        // Add elements to the set (ensures uniqueness)
        for (int num : arr) {
            uniqueElements.add(num);
        }

        // Iterate to find the kth largest distinct element
        int count = 0;
        for (int num : uniqueElements) {
            count++;
            if (count == k) {
                return num;
            }
        }

        // If k is out of bounds
        return -1; // Indicating that kth largest distinct element does not exist
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 7, 1, 9, 9, 4, 2, 8};
        int k = 3;
        
        int result = findKthLargestDistinct(arr, k);
        if (result != -1) {
            System.out.println("The " + k + "rd largest distinct element is: " + result);
        } else {
            System.out.println("The " + k + "rd largest distinct element does not exist.");
        }
    }
}
