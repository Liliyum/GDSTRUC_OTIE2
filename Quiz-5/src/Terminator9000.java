public class Terminator9000 {

    // Search algorithm that acts like the Terminator from the middle then left, right, left, right,
    // so on and so forth.

    public static int terminatorScan(String[] data, String key) {

        if (data == null || data.length == 0) {
            return -1;
        }

        int mid = data.length / 2;

        // Step 1: Check middle
        if (data[mid].equals(key)) {
            return mid;
        }

        int step = 1;

        // Step 2: Check side by side or rather outward like a terminator
        while (mid - step >= 0 || mid + step < data.length) {

            // Left side
            int leftIndex = mid - step;
            if (leftIndex >= 0 && data[leftIndex].equals(key)) {
                return leftIndex;
            }

            // Right side
            int rightIndex = mid + step;
            if (rightIndex < data.length && data[rightIndex].equals(key)) {
                return rightIndex;
            }

            step++;
        }

        // If key is not found
        return -1;
    }
}
