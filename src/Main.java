import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        int[] arrInt = new int[3]; //объявление целочисленного массива из 3-х элементов
        arrInt[0] = 1;//инициализация 1-го элемента целочисленного массива
        arrInt[1] = 2;//инициализация 2-го элемента целочисленного массива
        arrInt[2] = 3;//инициализация 3-го элемента целочисленного массива
        double[] arrDouble = {1.57, 7.654, 9.986}; //объявление вещественного массива с инициализацией элементов
        char[] arrChar = {'a', 'b', 'c', 'd', 'e'}; // //объявление символьного массива из 5-х элементов с инициализацией элементов

        System.out.println(" ");
        System.out.println("task 2");
        System.out.println(Arrays.toString(arrInt)); //вывод в консоль целочисленного массива arrInt
        System.out.println(Arrays.toString(arrDouble)); //вывод в консоль вещественного массива arrDouble
        System.out.println(Arrays.toString(arrChar)); //вывод в консоль символьного массива arrChar

        System.out.println(" ");
        System.out.println("task 3. v 1.0.");
        int[] arrIntReverse = new int[3];
        double[] arrDoubleReverse = new double[3]; //объявление вещественного массива с инициализацией элементов
        char[] arrCharReverse = new char[5]; // //объявление символьного массива из 5-х элементов с инициализацией элементов
        for (int i = 0; i < arrInt.length; i++) {
            arrIntReverse[i] = arrInt[arrInt.length-i-1];
        }
        for (int i = 0; i < arrDouble.length; i++) {
            arrDoubleReverse[i] = arrDouble[arrDouble.length - i-1];
        }
        for (int i = 0; i < arrChar.length; i++) {
            arrCharReverse[i] = arrChar[arrChar.length - i-1];
        }
        System.out.println(Arrays.toString(arrIntReverse)); //вывод в консоль целочисленного массива arrInt
        System.out.println(Arrays.toString(arrDoubleReverse)); //вывод в консоль целочисленного массива arrInt
        System.out.println(Arrays.toString(arrCharReverse)); //вывод в консоль целочисленного массива arrInt

        System.out.println(" ");
        System.out.println("task 3. v 2.0.");
        for (int i = 0; i < arrInt.length / 2; i++) { //оператор цикла для перебора первой пооловины массива
            int temp = arrInt[i];// создание переменной для перестановки значений элементов массива, присвоение ей значения i-го элемента
            arrInt[i] = arrInt[arrInt.length - i - 1]; // присвоение i-му элементу значения элемента, который необходимо переставить на его место
            arrInt[arrInt.length - i - 1] = temp; // присвоение элементу, значение которого присооено i-му элементу, значения i-го элемента
        }
        for (int i = 0; i < arrDouble.length / 2; i++) {
            double temp = arrDouble[i];
            arrDouble[i] = arrDouble[arrDouble.length - i - 1];
            arrDouble[arrDouble.length - i - 1] = temp;
        }
        for (int i = 0; i < arrChar.length / 2; i++) {
            char temp = arrChar[i];
            arrChar[i] = arrChar[arrChar.length - i - 1];
            arrChar[arrChar.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arrInt)); //вывод в консоль целочисленного массива arrInt
        System.out.println(Arrays.toString(arrDouble)); //вывод в консоль вещественного массива arrDouble
        System.out.println(Arrays.toString(arrChar)); //вывод в консоль символьного массива arrChar


            System.out.println(" ");
        System.out.println("task 4");
        for (int i = 0; i < arrInt.length; i++) { //оператор цикла для перебора массива
            if (arrInt[i] % 2 != 0) { //условный оператор для проверки элемента массива на нечетность
                arrInt[i] += 1; // инкремент значения элемента массива при выполнении условия
            }
        }
        System.out.println(Arrays.toString(arrInt)); //вывод в консоль целочисленного массива arrInt
    }
}