public class FindFirstandLastPositionofElementInSortedArray {
    public static void main(String[] args) {
        int nums[] = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = solution(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

    private static int[] solution(int[] nums, int target) {
        int[] result = {-1, -1};

        // Find the first occurrence of the target
        result[0] = findFirst(nums, target);
        // If the first occurrence is found, find the last occurrence
        if (result[0] != -1) {
            result[1] = findLast(nums, target);
        }

        return result;
    }

    private static int findFirst(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int firstOccurrence = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                firstOccurrence = mid;
                high = mid - 1; // Move left to find the first occurrence
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return firstOccurrence;
    }

    private static int findLast(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int lastOccurrence = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                lastOccurrence = mid;
                low = mid + 1; // Move right to find the last occurrence
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return lastOccurrence;
    }
}
