import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n:");
        int n = in.nextInt();
        int[] Array = new int[n];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int) (Math.random() * 101);//заполнение массива случайными целыми числами от 0 до 100
        }
        System.out.println("Исходный массив:\n" + Arrays.toString(Array));
        combSort(Array);
    }
    public static void combSort(int[] Array){
        double Factor = 1.247;
        int step = Array.length - 1;
        while(step >= 1){
            for(int i = 0;i + step < Array.length; ++i){
                if (Array[i] < Array[i + step]){
                    swap(Array, i, i + step);
                }}
            step /= Factor;
        }
        System.out.println("Конечный массив:\n" + Arrays.toString(Array));
    }
    public static void swap(int[] Array, int i, int j){
        int swap = Array[i];
        Array[i] = Array[j];
        Array[j] = swap;
    }
}