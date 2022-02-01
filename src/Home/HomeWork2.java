package Home;

public class HomeWork2 {

    public static void main(String[] args) {

        int x = 7;
        int y = 9;
        checkSum(x, y);

        int a = -5;
        printPositiveNegative(a);

        int b = -28;
        System.out.println(b <= 0);

        String c = "Все счастливые семьи похожи друг на друга";
        int d = 5;
        printStringTimes(c, d);

        int z = 1900;
        System.out.println(printLeapYear(z));

    }
    public static void checkSum(int x, int y) {
        if (x + y >= 10 && x + y <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void printPositiveNegative(int a) {
        if (a >= 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }

    public static void printStringTimes(String c, int d) {
        for (int i = 0; i < d; i++) {
            System.out.println(c);
        }
    }

    public static boolean printLeapYear(int z) {
        if (z % 100 != 0) { //Значит последние две цифры не 00
            return z % 4 == 0; //Проверяем на кратность 4м
        } else { //Значит последние две цифры 00
            int prefix = z / 100; //Отсекли последние два нуля
            return prefix % 4 == 0; //Проверяем первую часть на кратность 4м
        }
    }
}