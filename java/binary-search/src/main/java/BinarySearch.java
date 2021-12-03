import java.util.List;

class BinarySearch {
    private List<Integer> sortedList;

    BinarySearch(List<Integer> sortedList) {
        this.sortedList = sortedList;
    }

    public int indexOf(int val) throws ValueNotFoundException {
        if (sortedList == null || sortedList.isEmpty()) throw new ValueNotFoundException("Value not in array");
        int left = 0;
        int right = sortedList.size() - 1;

        while (left < right) {
            int mid = left + (right-left) / 2;

            if (sortedList.get(mid) < val) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        if (sortedList.get(left) != val) throw new ValueNotFoundException("Value not in array");

        return left;
    }
}
