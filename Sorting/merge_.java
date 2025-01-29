package Sorting;

public class merge_{

    public static void show(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid + 1, ei); // right part

        // merging left part and right part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // index for 1st sorted part
        int j = mid + 1; // index for 2nd sorted part
        int k = 0; // index for temp

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for left over elements in 1st sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // for left over elements in 2nd sorted part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copying temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 2,15,70};
        System.out.println("Before sorting:");
        show(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After sorting:");
        show(arr);
    }
}
