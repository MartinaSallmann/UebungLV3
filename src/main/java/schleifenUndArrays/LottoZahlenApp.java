package schleifenUndArrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LottoZahlenApp {

    public static void main(String[] args) {

        int size;
        int maxNumber;

        generateRandomNumbers(6,45);


    }

    public static int[] generateRandomNumbers(int size, int maxNumber) {
        int[] randomNumber = new int[size];

        for (int i = 0; i < size; i++) {
            randomNumber[i] = (int) (Math.random() * maxNumber + 1);
        }
        return randomNumber;
    }
}
