import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int face = 0;
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i % 10 + 1) * 111;
            face = face + array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(face);
    }
}
