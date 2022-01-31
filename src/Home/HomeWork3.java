package Home;

public class HomeWork3 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(arr);
        printArray(arr);

        int[] emptyArr = new int[100];
        fillEmptyArr(emptyArr);
        printArray(emptyArr);

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyArray(array3);
        printArray(array3);

        int[][] squareArray = new int[15][15];
        fillDiagonal(squareArray);
        printSquareArray(squareArray);

        int[] newArray = createArray(20, 5);
        printArray(newArray);


        minMaxElements();

    }

    public static void printSquareArray(int[][] array) {
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                System.out.print(array[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;

    }

    public static void fillDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }

    }

    public static void multiplyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }

    }

    public static void fillEmptyArr(int[] emptyArr) {
        for (int i = 0; i < emptyArr.length; i++) {
            emptyArr[i] = i + 1;
        }

    }

    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

    }

    public static void minMaxElements() {
        int[] minMaxArr = {1, 3, 5, 7, 9, 12, 15};
        int min = minMaxArr[0];
        int max = minMaxArr[0];
        for (int i = 1; i < minMaxArr.length; i++) {
            if(minMaxArr[i] < min){
                min = minMaxArr[i];
            }
            if (minMaxArr[i] > max){
                max = minMaxArr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}