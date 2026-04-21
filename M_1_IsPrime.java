public class M_1_IsPrime {
    
    public static int sieveOfEratosthenes(int n) {
        boolean isPrime[] = new boolean[n+1];
        for(int i=0; i<=n; i++) {
            isPrime[i] = true;
        }
        int count = 0;

        for(int i=2; i<n; i++) {
            if(isPrime[i]) {
                count++;

                for(int j=i*2; j <n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 50;

        System.out.println(sieveOfEratosthenes(n));
    }
}
