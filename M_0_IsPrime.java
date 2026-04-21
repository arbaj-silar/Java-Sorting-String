public class M_0_IsPrime {

    public static String isPrime(int n) {

        for(int i=2; i*i <= n; i++) {
            if(n%2 == 0) {
                return "Non Prime";
            }
        }

        return "Prime";
    }

    public static void main(String[] args) {
        int n = 13;

        System.out.println(isPrime(n));
    }
}