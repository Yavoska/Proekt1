import java.util.Arrays;
import java.util.Scanner;
class Main {


    public static int[] getValues() {
        int[] intArray = {-5, 60, 13, 3, -5};
        return intArray;
    }

    public static int[] massivFullRandom() {
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 40) - 10);
            //System.out.println(array[i] + ",");

        }
        System.out.print(Arrays.toString(array));

        return array;
    }

    public static void print(int[] args) {
        int[] arrayA = new int[6];
        print(arrayA);
    }

    /*
        public static int[] arrayСopy() {
            //int[] arrayA = new int[6];
            int[] arrayC = new int[6];
            boolean b = arrayC == print();
            for (int i = 0; i < arrayA1.length; i++) {
                arrayA1[i] = (int) Math.round((Math.random() * 40) - 10);
                System.out.println(arrayA1[i] + ",");
                arrayC[0] = arrayA1[0];
                arrayC[1] = arrayA1[1];
                arrayC[2] = arrayA1[2];
                arrayC[3] = arrayA1[3];
                arrayC[4] = arrayA1[4];
                arrayC[5] = arrayA1[5];
                boolean b1 = arrayC == arrayA1;
            }
            System.out.print(Arrays.toString(arrayC));
        return arrayA1;
        }
    */
    public static int arrayMax(int[] intArray) {

        int maxNum = intArray[0];

        for (int j : intArray) {
            if (j > maxNum)
                maxNum = j;
        }

        System.out.println("Maximum number = " + maxNum);
        int maxNum1 = arrayMax(intArray);
        return maxNum;

    }

    public static int[] arrayMin(int[] intArray) {
        int min = intArray[0] + 1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        System.out.println(min);
        return intArray;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose number");
        while (!sc.hasNextInt()) {
            sc.next();
        }
        int select = sc.nextInt();
        switch (select) {
            case 1:
                int[] result = massivFullRandom();
                System.out.print(Arrays.toString(result));
                break;
            case 2:
                //int[] result2=arrayСopy();
                //System.out.print(Arrays.toString(result2));
                break;
            case 3:
                int result3=arrayMax();
                break;
            case 4:
                int[] result4 = arrayMin();
                System.out.print(Arrays.toString(result4));
                break;
            default:
                System.out.print("Incorrect number");

        }
    }
}