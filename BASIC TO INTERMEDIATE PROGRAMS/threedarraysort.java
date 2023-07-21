import java.util.Arrays;
import java.util.Scanner;

public class threedarraysort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc .nextInt();

        int array[][]=new int[size][size];

        for (int i = 0; i <size; i++) {
            for(int j=0;j<size;j++){
            array[i][j]=sc.nextInt();
        }
    }
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            
        
        Arrays.sort(array[i]);
       
    }
}
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[i][j]);
        }
        System.out.println();
    }
    
    //System.out.println(Arrays.toString(array));
    }
}