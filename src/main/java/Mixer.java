import java.util.Arrays;

/**
 * Created by Administrator on 4/20/2017.
 */
public class Mixer {
    static int vi;

    public static int[] create(int a) {
        int[] ints = new int[a];
        for (int x = 0; x < ints.length; x++) {
            ints[x] = x;
        }
        return ints;
    }

    public static int[] mix (int[] a) {
        int[] mixedA = new int[a.length];
        for (int i = 0; i < mixedA.length/2; i = i+1) {
            mixedA[2*i] = a[i];
            mixedA[2*i + 1] = a[i+mixedA.length/2];
        }
        return mixedA;
    }

    /**public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int get = in.nextInt();
     int[] sample = Mixer.create(i);
     int[] a = Mixer.mix(sample);
     while (true) {
     a = Mixer.mix(a);
     counter++;
     if (Arrays.equals(a, sample)) {
     System.out.println("counter = " + counter);
     break;
     }
     }
     }
     */

    public static int counter(int i) {
        int[] sample = Mixer.create(i);
        int[] a = Mixer.mix(sample);
        int counter = 1;
        while (true) {
            a = Mixer.mix(a);
            counter++;
            if (Arrays.equals(a, sample)) {
                break;
            }
        }
        return counter;
    }
}
