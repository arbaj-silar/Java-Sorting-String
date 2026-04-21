public class N_PrintDigits {
    
    public static void reverse(int n) {

        while(n != 0) {
            int dig = n%10;
            System.out.print(dig+" ");

            n /= 10;
        }
    }

    public static void main(String[] args) {
        int n = 8465;

        reverse(n);
    }
}
