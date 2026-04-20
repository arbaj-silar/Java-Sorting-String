public class E_Merge2SortedArray {
 
    public static void mergeArray(int A[], int m, int B[], int n) {
        int idx = m+n-1;
        int i = m-1, j = n-1;

        while(i >= 0 && j >= 0) {
            if(A[i] >= B[j]) {
                A[idx--] = A[i--];
            } else {
                A[idx--] = B[j--];

            }
        }

        while(j >= 0) {
            A[idx--] = B[j--];
        }
    }

    public static void main(String[] args) {
        int A[] = {1, 2, 3, 0, 0, 0};
        int B[] = {2, 5, 6};

        mergeArray(A, 3, B, 3);
        for(int val: A) {
            System.out.print(val+" ");
        }
        System.out.println();
    }
    
}