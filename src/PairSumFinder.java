public class PairSumFinder {

    public static int findPairsWithSum(int[] arr, int X) {
        //Return 0 if not matched critera
        if (arr == null || arr.length < 2) {
            return 0;
        }

        //Set count and left counter to 0.
        int count = 0;
        int left = 0;
        int right = arr.length - 1;

        //Condition for left greater than right
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            //Condition for when they equal each other
            if (currentSum == X) {
                count++;
                left++;
                right--;
                //Condition for when sum outways X.
            } else if (currentSum < X) {
                left++;
                //Condition for right outwaying left
            } else {
                right--;
            }
        }

        //Return the count
        return count;
    }

    //Using examples from the problem statement.
    public static void main(String[] args) {

        int[] arr1 = {3, 4, 5, 6};
        int X1 = 1;
        System.out.println("Output for X1: " + findPairsWithSum(arr1, X1)); // Output: 0

        int[] arr2 = {0, 15, 32, 2000, 15000};
        int X2 = 15;
        System.out.println("Output for X2: " + findPairsWithSum(arr2, X2)); // Output: 1

        int[] arr3 = {1, 1, 10, 32, 41};
        int X3 = 42;
        System.out.println("Output for X3: " + findPairsWithSum(arr3, X3)); // Output: 2
    }
}