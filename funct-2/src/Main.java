import java.util.Arrays;

class Main {
    public static int[] massivFullRandom() {
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 40) - 10);
            System.out.println(array[i]+",");

        }
        return array;
    }
    public static void main(String[] args) {
        System.out.print("Choose Function" + "\n");
        int[] result = MassivFullRandom();
        System.out.print(Arrays.toString(result));
    }
}
