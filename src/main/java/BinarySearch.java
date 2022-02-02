public class BinarySearch {
    // Recursive
    public static int binSearchRecursive (int [] arr, int target, int low, int high) {
        // This recursive function requires a base case
        if (high < low)
            return -1;

        int mid = (low + high) / 2;  // mid: midway between low & high

        if (arr[mid] == target)
            return mid;
        else if (target > arr[mid])  // Eliminate high half (and mid)
            return binSearchRecursive(arr, target, mid+1, high);
        else                         // Eliminate low half (and mid)
            return binSearchRecursive(arr, target, low, mid-1);
    }


    // Iterative
    public static int binSearchIterative (int [] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        while(!(high<low)) {
            int mid = (low + high) / 2;  // mid: midway between low & high

            if (arr[mid] == target)
                return mid;
            else if (target > arr[mid])  // Eliminate low half (and mid)
                low=mid+1;
            else                         // Eliminate high half (and mid)
                high=mid-1;
        }
        return -1;
    }

}
