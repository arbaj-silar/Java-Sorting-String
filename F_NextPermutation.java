public class F_NextPermutation {
 
    public static void nextPermutation(int A[]) {
        int pivot = -1, n = A.length;

        for(int i=n-2; i>=0; i--) {
            if(A[i] < A[i+1]) {
                pivot = i;
                break;
            }
        }

        if(pivot == -1) {
            int i=0, j=n-1;

            while(i<=j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++; j--;
            }
            return;
        }

        for(int i=n-1; i>pivot; i--) {
            if(A[i] > A[pivot]) {
                int temp = A[i];
                A[i] = A[pivot];
                A[pivot] = temp;

                break;
            }
        }
        
        int i = pivot+1, j = n-1;
        while(i <= j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;

            i++; j--;
        }
    }

    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 6, 5};
        
        nextPermutation(A);
        for(int val: A) {
            System.out.print(val+" ");
        }
        System.out.println();
    }
}