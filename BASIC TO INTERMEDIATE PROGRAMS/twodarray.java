import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE:");
        int size = sc.nextInt();

        System.out.println("ENTER THE 2D ARRAY:");
        int arr[][]=new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
    
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
            int temp=arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]=temp;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            int low=0;
            int high =size-1;

        while(low<high){
            int temp1=arr[i][low];
            arr[i][low]=arr[i][high];
            arr[i][high]=temp1;

            low++;
            high--;
        }
        }
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]);
            }
        }
        
    }
    
    
}
