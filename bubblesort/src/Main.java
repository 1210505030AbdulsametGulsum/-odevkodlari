import java.util.Random;
class bubblesort {
    public static void main( String args[] ) {
        Random random = new Random();
int array[]=new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50000); //0 ile 50000 arasında 10000 sayılık dizi oluşturdum.
    }
        bubbleSort(array);
        }
    private static void bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){

                if(array[j-1] < array[j]){

                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp; //sıralama yaptım

                }
            }
        }System.out.println("Maximum değer" +array[0]); // en büyük sayıyı yazdırdım 1.096 saniyede sonuca ulaştım.
    }


    }



