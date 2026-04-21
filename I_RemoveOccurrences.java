public class I_RemoveOccurrences {
    public static String removeOccurrence(String s, String part) {
        StringBuilder str = new StringBuilder(s);
        int idx;
        while((idx = str.indexOf(part)) != -1) {
            str.delete(idx, idx+part.length());
        }

        return str.toString();
    } 

    public static void main(String[] args) {
        String s = "daabcaabcbc";
        String part = "abc";

        System.out.println("Left String: "+removeOccurrence(s, part));
    }
}