//Concentric Number Pattern
//
//4444444
//4333334
//4322234
//4321234
//4322234
//4333334
//4444444

public class Q14 {

    public static void concentricPattern(int n) {

        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                int min = Math.min(Math.min(top, bottom),
                        Math.min(left, right));

                System.out.print((n - min) + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        concentricPattern(4);
    }
}