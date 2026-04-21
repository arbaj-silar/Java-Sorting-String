public class O_ArmstrongNumber {
    
    public static boolean isArmstrong(int n) {
        int copyN = n;
        int sumOfCube = 0;

        while(n != 0) {
            int dig = n%10;
            sumOfCube += (dig * dig * dig);

            n /= 10;
        }

        return sumOfCube == copyN;
    }

    public static void main(String[] args) {
        int n = 153;

        System.out.println("IsArmstrong Number: "+isArmstrong(n));
    }
}
