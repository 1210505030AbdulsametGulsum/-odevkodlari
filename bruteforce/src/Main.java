import java.util.Random;

public class Main {
    public static void main(String[] args) {
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
int max=array[0];
        for(int i=0; i < n; i++){
            if(max<i){
                max=i;
            }



                }
        System.out.println("Maximum değer" +max); // en büyük sayıyı yazdırdım 0,596 saniyede sonuca ulaştım.
            }

 }

