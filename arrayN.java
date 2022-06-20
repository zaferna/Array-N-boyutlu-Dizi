import java.util.Arrays;
import java.util.Scanner;

public class arrayN {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.println("Dizinin Boyutunu Gir : ");

        n= inp.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            int j;

            System.out.print((i+1)+". Eleman: ");
            j= inp.nextInt();
            arr[i]=j;

        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



    }
}

