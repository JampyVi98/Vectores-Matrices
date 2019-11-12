/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantilla;

/**
 *
 * @author Usuario
 */
public class Operaciones_ordenar_vec {

    int i, j, k, aux;

    public int[] BubbleSort(int vector[], int tamano) {
        for (i = 0; i < tamano - 1; i++) {
            for (j = i + 1; j < tamano; j++) {
                if (vector[i] > vector[j]) {
                    aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                    aux = 0;
                }
            }
        }

        return vector;
    }

    public int[] SelectionSort(int vector[], int tamano) {
        int p;
        for (k = 0; k < tamano - 1; k++) {
            p = k;
            for (i = k + 1; i <= tamano - 1; i++) {
                if (vector[i] < vector[p]) {
                    p = i;
                }
            }
            if (p != k) {
                aux = vector[p];
                vector[p] = vector[k];
                vector[k] = aux;
            }
        }

        return vector;
    }

    public int[] InsertionSort(int vector[], int tamano) {
        for (i = 1; i < tamano; i++) {
            aux = vector[i];
            for (j = i - 1; j >= 0 && vector[j] > aux; j--) {
                vector[j + 1] = vector[j];
            }
            vector[j + 1] = aux;
        }

        return vector;
    }

    public int[] ShellSort(int vector[], int tamano) {
        for (int increment = tamano / 2; increment > 0; increment = (increment == 2 ? 1 : (int) Math.round(increment / 2.2))) {
            for (i = increment; i < tamano; i++) {
                for (j = i; j >= increment && vector[j - increment] > vector[j]; j -= increment) {
                    int temp = vector[j];
                    vector[j] = vector[j - increment];
                    vector[j - increment] = temp;
                }
            }
        }

        return vector;
    }

    public void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] < r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

}
