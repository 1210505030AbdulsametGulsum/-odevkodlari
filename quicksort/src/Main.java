import java.util.Random;

public class Main {
    static class QuickSort
    {
        int partition(int arr[], int low, int high)
        {
            int pivot = arr[high];
            int i = (low-1);
            for (int j=low; j<high; j++)
            {

                if (arr[j] < pivot)
                {
                    i++;


                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }


            int temp = arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = temp;

            return i+1;
        }



        void quicksort(int arr[], int low, int high)
        {
            if (low < high)
            {

                int pi = partition(arr, low, high);


                quicksort(arr, low, pi-1);
                quicksort(arr, pi+1, high);
            }
        }


        static void printArray(int arr[])
        {

            for (int i=0; i< arr.length; ++i)
                System.out.print(arr[i]+" ");
            System.out.println();
        }
        public static void main(String args[])
        {
            Random random = new Random();
            int arr[]=new int[10000];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(50000); //0 ile 50000 arasında 10000 sayılık dizi oluşturdum.
            }
            int n = arr.length;

            QuickSort ob = new QuickSort();
            ob.quicksort(arr, 0, n-1);

            System.out.println("Sıralama sonrası dizi");
            printArray(arr); //1,149 saniyede gerçekleşti
        }
    }
    }
