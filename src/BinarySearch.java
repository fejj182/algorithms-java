import java.util.List;

public class BinarySearch {
    private List<String> list;

    public BinarySearch(List<String> list) {
        this.list = list;
    }

    public int find(String term) {
        int low = 0;
        int high = this.list.size() - 1;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;
            int compare = term.compareTo(this.list.get(mid));

            if (compare < 0) {
                high = mid - 1;
            } else if (compare > 0) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
