public class RotateArray {
    public static int[] rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            int newPosition = (i + k) % n;
            newArray[newPosition] = nums[i];
        }
        return newArray;
    }
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        printArray(rotateArray(nums1, 3));
        int[] nums2 = {1, 2};
        printArray(rotateArray(nums2, 3));
    }
}
