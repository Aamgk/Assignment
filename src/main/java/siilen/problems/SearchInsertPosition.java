package siilen.problems;

public class SearchInsertPosition {
    public SearchInsertPosition() {}
    public int searchPosition(int[] arr, int x)
    {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }
}
