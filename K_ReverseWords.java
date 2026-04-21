public class K_ReverseWords {
 
    public static String reverse(String s) {
        String str = new StringBuilder(s).reverse().toString();
        String ans = "";

        for(int i=0; i<s.length(); i++) {
            String word = "";

            while(i<s.length() && str.charAt(i) != ' ') {
                word += str.charAt(i);
                i++;
            }

            String rev = new StringBuilder(word).reverse().toString();
            if(rev.length() > 0) {
                ans += " "+ rev;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "  Hello World  Invincible    ";

        System.out.println("Reverse String: "+reverse(s));
    }
}