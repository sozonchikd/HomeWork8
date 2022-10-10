import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//Задача 1
        System.out.println("Задача 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] fractionNumbers = {1.57, 7.654, 9.986};

        int[] myNumbers = {7, 4, 33, 69};

        System.out.println("Задача 2");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(fractionNumbers));         //Первый Вариант
        System.out.println(Arrays.toString(myNumbers));

        //System.out.print(numbers[0]+","+numbers[1]+","+ numbers[2]);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < fractionNumbers.length; i++) {              //Второй вариант
            System.out.print(fractionNumbers[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.print(myNumbers[i] + ",");
        }

        System.out.println("\nЗадача 3");

        for (int l = numbers.length - 1; l >= 0; l--) {
            System.out.print(numbers[l] + ",");
        }
        System.out.println();
        for (int l = fractionNumbers.length - 1; l >= 0; l--) {
            System.out.print(fractionNumbers[l] + ",");
        }
        System.out.println();
        for (int l = myNumbers.length - 1; l >= 0; l--) {
            System.out.print(myNumbers[l] + ",");
        }

        System.out.println("\nЗадача 4");

        for (int a = 0; a < numbers.length; a++) {          //Вариант 1
            if (numbers[a] % 2 != 0) {
                numbers[a] += 1;
            }
            System.out.print(numbers[a] + ",");
        }
        System.out.println();
        for (int a = 0; a < numbers.length; a++) {
            if (numbers[a] % 2 == 1) {                   //Вариант 2
                numbers[a]++;
            }
            System.out.print(numbers[a] + ",");
        }




    }
}