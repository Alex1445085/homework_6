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
        System.out.println();

        // 7.
        System.out.println();
        System.out.println("7.");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 8.
        System.out.println();
        System.out.println("8.");
        int deposit = 0;
        for (int month = 1; month <= 12; month++) {
            deposit = deposit + 29000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit);
        }

        // 9.
        System.out.println();
        System.out.println("9.");
        double depositInBank = 0;
        for (int month = 1; month <= 12; month++) {
            depositInBank = depositInBank + depositInBank * 0.01;
            depositInBank = depositInBank + 29000;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f\n", month, depositInBank);
        }

        // 10.
        System.out.println();
        System.out.println("10.");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2*i));
        }
    }
}