public class D_1_SortColor {

    public static void sortColor(int colors[]) {
        int st = 0, mid = 0, end = colors.length-1;

        while(mid <= end) {
            if(colors[mid] == 0) {
                int temp = colors[mid];
                colors[mid] = colors[st];
                colors[st] = temp;

                st++; mid++;
            } else if(colors[mid] == 1) {
                mid++;
            } else {
                int temp = colors[mid];
                colors[mid] = colors[end];
                colors[end] = temp;

                end--;
            }
        }
    }

    public static void main(String[] args) {
        int colors[] = {0, 2, 1, 2, 1, 0, 0, 1, 1, 0};
        
        sortColor(colors);
        for(int val: colors) {
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
