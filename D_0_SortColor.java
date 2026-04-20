public class D_0_SortColor {

    public static void sortColor(int colors[]) {
        int count_0 = 0, count_1 = 0, count_2 = 0;

        for(int val: colors) {
            if(val == 0) {
                count_0++;
            } else if(val == 1) {
                count_1++;
            } else {
                count_2++;
            }
        }

        int idx = 0;

        for(int i=0; i<count_0; i++) {
            colors[idx++] = 0;
        }
        for(int i=0; i<count_1; i++) {
            colors[idx++] = 1;
        }
        for(int i=0; i<count_2; i++) {
            colors[idx++] = 2;
        }

    }

    public static void main(String[] args) {
        int colors[] = {0, 2, 1, 2, 1, 0, 0, 1, 1, 2};
        
        sortColor(colors);
        for(int val: colors) {
            System.out.print(val+" ");
        }
        System.out.println();
    }
}