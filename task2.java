// 2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class task2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Количество чисел");

    int[] array = new int[sc.nextInt()];
    for (int i = 0; i < array.length; i++) {
        System.out.println("Введите число: ");
        array[i] = sc.nextInt();
    }

    int [] val = IntStream.of(array).sorted().toArray();

    if(Arrays.equals(array, val)) {
        System.out.println("Восходящая");
        return;
    }
    for (int i = 0; i < val.length / 2; i++) {
        int tmp = val[i];
        val[i] = val[val.length - i - 1];
        val[val.length - i - 1] = tmp;
    }
    if(Arrays.equals(array, val)) 
        System.out.println("Нисходящая");
    else
        System.out.println("Нет последовательности.");
    }   
}
