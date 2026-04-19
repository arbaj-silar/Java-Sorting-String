public class C_InsertionSort {
    public static void insertionSort(int nums[]) {

        for(int i=1; i<nums.length; i++) {
            int curr = nums[i], prev = i-1;

            while(prev >= 0 && nums[prev] > curr) {
                nums[prev+1] = nums[prev];
                prev--;
            }

            nums[prev+1] = curr;
        }
    }

    public static void main(String[] args) {
        int nums[] = {9, 3, 1, 8, 2, -2};

        insertionSort(nums);
        for(int val: nums) {
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
