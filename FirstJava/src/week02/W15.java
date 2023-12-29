package week02;

import java.util.Arrays;

public class W15 {
    public static void main(String[] args) {
        int[][] a = {{0}, {1}, {2}, {3}};
        int[][] b = a.clone();

        a[0][0] = 3;

        System.out.println(b[0][0]);
        System.out.println(a[0][0]);
    }
}
