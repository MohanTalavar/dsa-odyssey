public class KandanesAlgorithm {

    /*
    * Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
    A subarray is a contiguous non-empty sequence of elements within an array.
    Examples:
    Input: nums = [2, 3, 5, -2, 7, -4]
    Output: 15
    Explanation: The subarray from index 0 to index 4 has the largest sum = 15
    * */

//    Referr :->   https://www.geeksforgeeks.org/dsa/largest-sum-contiguous-subarray/
    public static int maxSubArray(int[] arr){

        // Stores the result (maximum sum found so far)
        int res = arr[0];

        // Maximum sum of subarray ending at current position
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // Either extend the previous subarray or start
            // new from current element
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);

            // Update result if the new subarray sum is larger
            res = Math.max(res, maxEnding);
        }
        return res;

    }

    public static void main(String[] args) {

        int[] nums1= {2,3,-8,7,-1,2,3};
        int[] nums2 = {-2,-3,-7,-2,-10,-4};
        int[] nums3 = {1,2,3,4,5};
        System.out.println(maxSubArray(nums1));
//        System.out.println(maxSubArray(nums2));

    }
}
