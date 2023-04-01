import java.util.*;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static int boundarySearch(boolean[] arr) {
        int low = 0, high = arr.length - 1, boundary = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid]) {
                boundary = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return boundary;
    }

    public static void main(String[] args) {
        // Finds the target through binary search
        assert binarySearch(new int[] {1, 2, 3, 4, 5}, 0) == -1;
        assert binarySearch(new int[] {1, 2, 3, 4, 5}, 1) == 0;
        assert binarySearch(new int[] {1, 2, 3, 4, 5}, 3) == 2;
        assert binarySearch(new int[] {1, 2, 3, 4, 5}, 5) == 4;
        assert binarySearch(new int[] {1, 2, 3, 4, 5}, 6) == -1;

        // Finds the first true through binary search
        assert boundarySearch(new boolean[] {false, false, false, false, false}) == -1;
        assert boundarySearch(new boolean[] {false, false, true, true, true}) == 2;
        assert boundarySearch(new boolean[] {true, true, true, true, true}) == 0;
    }
}