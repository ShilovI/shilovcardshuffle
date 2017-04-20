import java.util.Arrays;


class Mixer {
    static int vi;

    private static int[] create(int a) {
        int[] ints = new int[a];
        for (int x = 0; x < ints.length; x++) {
            ints[x] = x;
        }
        return ints;
    }

    private static int[] mix (int[] a) {
        int[] mixedA = new int[a.length];
        for (int i = 0; i < mixedA.length/2; i = i+1) {
            mixedA[2*i] = a[i];
            mixedA[2*i + 1] = a[i+mixedA.length/2];
        }
        return mixedA;
    }


    static int counter(int i) {
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
