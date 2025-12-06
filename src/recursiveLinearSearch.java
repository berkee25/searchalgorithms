public class recursiveLinearSearch {
    // Recursive
    int linearSearchRecursive(int[] arr, int target, int index) {


        if (index == arr.length) {
            return -1;
        }


        if (arr[index] == target) {
            return index;
        }


        return linearSearchRecursive(arr, target, index + 1);
    }
}

