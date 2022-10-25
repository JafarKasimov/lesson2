public class Main {

    public static void main(String[] args) {
        int num = 8;
        tea();


        switch (num) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            case 8:
                System.out.println("8");
                break;
            case 9:
                System.out.println("9");
                break;

        }
        if (num < 0 || num == 2) {
            System.out.println("допустимое число");
        } else {
            System.out.println("пока");
        }

        System.out.println(getSquare());

    }

    public static void tea() {
        System.out.println("zavtrak");

        System.out.println("вода");
        System.out.println("чай");
        System.out.println("чайник");
        System.out.println("сахар");
        System.out.println("кружка");

    }

    public static int getSquare() {
        return 3 * 5;
    }

    public static int getSquare(int a, int b) {
        return a * b;
    }

    // метод не возвращающии с параметрами
    public static void swapFunction(int a, int b) {
        System.out.println(" do zameny: + a = " + a + " b =" + b);

         
    }

}