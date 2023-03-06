package memory;

import java.lang.ref.SoftReference;

public class Main {
    public static void main(String[] args) {

        int[] ints = new int[Integer.MAX_VALUE / 100];

        SoftReference<int[]> arr = new SoftReference<>(ints);

        int i = 0;
        ints = new int[Integer.MAX_VALUE / 150];
        ints = new int[Integer.MAX_VALUE / 150];

        System.out.println(arr.get() == null);

    }
}
