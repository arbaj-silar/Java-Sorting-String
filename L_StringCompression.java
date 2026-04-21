public class L_StringCompression {
 
    public static int compression(char ch[]) {
        int idx = 0;

        for(int i=0; i<ch.length; i++) {
            char c = ch[i];
            int count = 0;

            while(i<ch.length && ch[i] == c) {
                count++; i++;
            }

            if(count == 1) {
                ch[idx++] = c;
            } else {
                ch[idx++] = c;
                String s = Integer.toString(count);

                for(char j=0; j<s.length(); j++) {
                    ch[idx++] = s.charAt(j);
                }
            }
            i--;
        }

        return idx++;
    } 

    public static void main(String[] args) {
        char ch[] = {'a', 'a', 'b', 'b', 'b', 'b', 'd', 'c', 'c', 'c'};

        System.out.println("After Compression: "+compression(ch));
    }
}
