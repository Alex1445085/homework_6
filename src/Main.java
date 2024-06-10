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

        //5.
        System.out.println();
        System.out.println("5.");
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0) {
                System.out.println(i + " год является високосным. ");
            }
        }

        // 6.
        System.out.println();
        System.out.println("6.");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }

        System.out.println();
        maxNum = 0;
        int delta = 7;
        for (int i = 1; maxNum < 98; i++) {
            maxNum =  delta * i;
            System.out.print(maxNum + " ");
        }
    }
}