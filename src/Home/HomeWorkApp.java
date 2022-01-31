package Home;

public class HomeWorkApp {

    //1.
    public static void main (String[] args) {
        System.out.println("Hello!");
        System.out.println("_______________");


        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();
    }
    //2.
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println("_______________");
    }
    //3.
    public static void checkSumSign() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }

        System.out.println("_______________");
    }
    //4.
    public static void printColor() {
        int value = 115;
        if (value <= 0){
            System.out.println("Красный");
        }
        else if (value >0 && value <= 100){
            System.out.println("Желтый");
        }
        else if (value > 100){
            System.out.println("Зеленый");
        }
        System.out.println("_______________");
    }

    //5.
    public static void compareNumbers(){
        int a = 235;
        int b = 118;
        if (a >= b){
            System.out.println("(a >= b)");
        }
        else {
            System.out.println("(a < b)");
        }
        System.out.println("_______________");
    }


}
