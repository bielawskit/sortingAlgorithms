package pl.tomaszbielawski;

import java.util.Random;

public class TestOfSorting {

    public static void main(String[]args) {

        Random r = new Random(); // nowy obiekt klasy random
        int[]testArray  = new int[50];
        for(int i = 0; i < testArray.length; i++){
            testArray[i] = r.nextInt(100); // losowy przydział liczb do tablicy, przedział od 0 do 100
        }
        TestOfSorting.printArray(testArray);

        BubbleSort.sort(testArray);

        TestOfSorting.printArray(testArray);

    }

    public static void printArray(int[] arr) {
        for (int j = 0; j < arr.length; j++){
            System.out.println(arr[j] + " ");
        }
        System.out.println();
    }
}
