public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

        // 1.
        System.out.println("1.");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            if (i < 10) {
                System.out.print(", ");
            }
            else {
                System.out.println(".");
            }
        }

        // 2.
        System.out.println();
        System.out.println("2.");
        for (int i = 10; i > 0; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(", ");
            }
            else {
                System.out.println(".");
            }
        }

        // 3.
        System.out.println();
        System.out.println("3.");
        int maxNum = 17;
        for (int i = 0; i <= maxNum; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
                if (i < maxNum - 1) {
                    System.out.print(", ");
                }
                else {
                    System.out.println(".");
                }
            }
        }

        // 4.
        System.out.println();
        System.out.println("4.");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i);
            if (i > -10) {
                System.out.print(", ");
            }
            else {
                System.out.println(".");
            }
        }
    }



}