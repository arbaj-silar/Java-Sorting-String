public class G_ReverseString {

    public static String reverse(String s) {
        char str[] = s.toCharArray();
        int st = 0, end = s.length()-1;

        while(st < end) {
            char temp = str[st];
            str[st] = str[end];
            str[end] = temp;

            st++; end--;
        }

        String ans = new String(str);
        return ans;
    }

    public static void main(String[] args) {
        String s = "HELLO";

        String str = new StringBuilder(s).reverse().toString();
        System.out.println(str);
        
        System.out.println(reverse(s));
    }
}
