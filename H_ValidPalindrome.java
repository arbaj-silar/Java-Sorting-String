public class H_ValidPalindrome {

    public static boolean isAlphaNum(char ch) {
        if(Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch) <= 'z'
            || ch >= '0' && ch <= '9') {
                return true;
            }
        
        return false;
    }

    public static boolean validPalindrome(String s) {
        int st = 0, end = s.length()-1;

        while(st < end) {
            
            if(!isAlphaNum(Character.toLowerCase(s.charAt(st)))) {
                st++;
                continue;
            }
            if(!isAlphaNum(Character.toLowerCase(s.charAt(end)))) {
                end--;
                continue;
            }

            if(Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            st++; end--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "s@#Car^RA*cs$%^&$%";

        System.out.println("Palindrome: "+validPalindrome(s));
    }
}