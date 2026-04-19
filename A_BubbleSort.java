public class A_BubbleSort {
    
    public static void bubbleSort(int nums[]) {

        for(int i=0; i<nums.length-1; i++) {
            boolean isSwap = false;

            for(int j = 0; j<nums.length-i-1; j++) {
                if(nums[j] > nums[j+1]) {
                    nums[j] += nums[j+1];
                    nums[j+1] = nums[j] -nums[j+1];
                    nums[j] -= nums[j+1];

                    isSwap = true;
                }
            }

            if(!isSwap) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {-1, -3, 0, 1, 9, 4, 2, 5};

        bubbleSort(nums);
        for(int val: nums) {
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
