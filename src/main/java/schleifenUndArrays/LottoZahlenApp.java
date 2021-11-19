package schleifenUndArrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LottoZahlenApp {

    public static void main(String[] args) {

        int size;
        int maxNumber;

        int [] tipp = generateRandomNumbers(6,45);
        for (int i : tipp){
            System.out.println(i + " ");
        }
        System.out.println();

        System.out.println("Tipp: " + Arrays.toString(tipp));
    }

    public static int[] generateRandomNumbers(int size, int maxNumber) {
        int[] randomNumber = new int[size];

        for (int i = 0; i < size; i++) {
            randomNumber[i] = (int) (Math.random() * maxNumber + 1);
        }
        return randomNumber;
    }
}
