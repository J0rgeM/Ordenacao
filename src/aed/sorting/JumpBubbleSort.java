package aed.sorting;

import java.util.Arrays;
import java.lang.Math;
import java.util.Random;

public class JumpBubbleSort extends Sort {
    private static Random random = new Random();
    public static <T extends Comparable<T>> void sort(T[] a)
    {
        int n = a.length - 1; // tamanho do array
        boolean swapped = false;

        for(double d = n; d >= 1; d = d*0.77)  // atualizar o d
        {
            for (int j = 0; j + (int) d <= n; j++) // iterar pelo array
                 {
                    if (less(a[j + (int) d], a[j])) // se o atual é menor que o j-d
                    {
                        exchange(a, j, j + (int) d);
                        swapped = true;
                    }
                }
        if (d == 1 && !swapped) return; // d == 1 e não houver trocar, significa que já está organizado
        }
     }

    
    public static void main(String[] args)
    {
       /* Integer[] array = new Integer[50000];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 100);
        }
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(isSorted(array));*/

        /*
          ordenado: 0.022200
          ordenado inversamente: 0.041650
          semi-ordenado: 0.046550
          random: 0.030725
         */

    }
}