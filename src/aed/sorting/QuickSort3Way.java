package aed.sorting;

import java.util.Arrays;

public class QuickSort3Way extends Sort {

    public static <T extends Comparable<T>> void sorted(T[] a, int lt, int ht)
    {
        int n = ht-lt; // tamanho do array
        boolean swapped = false;

        for(double d = n-1; d >= 1; d = d*0.77)  // atualizar o d
        {
            swapped = false;
            for(int j = lt; (int) (j+d) < n+lt; j++) // iterar pelo array
            {
                if(less(a[(int) (j+d)], a[j])) // se o atual é menor que o j-d
                {
                    exchange(a,j, (int) (j+d));
                    swapped = true;
                }
            }
            if(d == 1 && !swapped) return; // d == 1 e não houver trocar, significa que já está organizado
        }
    }

    public static <T extends Comparable<T>> void sort(T[] a)
    {
            int n = a.length; // number of elements
            int i = 1; // number of elements less than pivot, so far, plus 1 for the pivot
            int lt = 0; // number of elements lower than pivot;
            int ht = n-1; // number of elements greater than pivot, so far;
            int start = 0; // starting
            T pivot = a[start];


            while (i <= ht)
            {
                if(less(a[i],pivot))// comparar se o primeiro é maior que o segundo
                {
                    exchange(a, lt, i);
                    lt++;
                    i++;
                    start++;
                }
                else if(less(pivot,a[i])) // comparar se o primeiro é menor que o segundo
                {
                    exchange(a, ht, i);
                    ht--;
                }
                else // quando numero é igual o pivot e I avanca
                {
                    i++;
                    start++;
                }
            }
            sorted(a,0,lt);
            sorted(a,ht,n);
    }


    
    public static void main(String[] args)
    {
        Integer[] test = new Integer[20];
        test[0] = 5;
        for (int i = 1; i < 20; i++) {
            int rdm = (int)(Math.random() * 10);
            test[i] = rdm;
        }
        System.out.println(test[0]);
        System.out.println(Arrays.toString(test));
        sort(test);
        System.out.println(Arrays.toString(test));
    }
}
