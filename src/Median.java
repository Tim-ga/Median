import java.util.Arrays;

public class Median {

    public static float median(int[] array) {
        int[] array1 = new int[array.length];
        System.arraycopy(array, 0, array1, 0, array.length);
        Arrays.sort(array1);
        float median = 0;
        if (array1.length % 2 == 0) {
            float i = (float) array1[((array1.length + 1) / 2) - 1];
            float j = (float) array1[((array1.length + 1) / 2)];
            median = (i + j) / 2;
        }
        if (array1.length % 2 != 0) {
            median = array1[((array1.length + 1) / 2) - 1];
        }
        return median;
    }

    public static double median(double[] array) {
        double[] array1 = new double[array.length];
        System.arraycopy(array, 0, array1, 0, array.length);
        Arrays.sort(array1);
        double median = 0;
        if (array1.length % 2 == 0) {
            float i = (float) array1[((array1.length + 1) / 2) - 1];
            float j = (float) array1[((array1.length + 1) / 2)];
            median = (i + j) / 2;
        }
        if (array1.length % 2 != 0) {
            median = array1[((array1.length + 1) / 2) - 1];
        }
        return median;
    }
}
