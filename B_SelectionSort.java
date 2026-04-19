public class B_SelectionSort {

    public static void selectionSort(int nums[]) {

        for(int i=0; i<nums.length-1; i++) {
            int smallestIdx = i;
        
            for(int j=i+1; j<nums.length; j++) {
                if(nums[smallestIdx] > nums[j]) {
                    smallestIdx = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[smallestIdx];
            nums[smallestIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int nums[] = {9, 3, 1, 8, 2, -2};

        selectionSort(nums);
        for(int val: nums) {
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
