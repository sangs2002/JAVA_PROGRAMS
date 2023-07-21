import java.util.Arrays;
import java.util.Scanner;

public class symbolsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE:");
        int size=sc.nextInt();
        System.out.println("ENTER THE CHAR ARRAY 1:");
        char arr1[]=new char[size];
        char temp[]=new char[size];
        //Arrays.sort(arr1);
        //System.out.println(arr1);
        for (int i = 0; i < size; i++) {
            arr1[i]=sc.next().charAt(0);
        }
        System.out.println("ENTER THE CHAR ARRAY 2:");
        char arr2[]=new char[size];
        for (int i = 0; i < size; i++) {
            arr2[i]=sc.next().charAt(0);
        }

        
        
        
        System.out.println("THE ARRAY BEFORE SORT->");
        System.out.println(Arrays.toString(arr1));
        System.out.println("After sort");
        Arrays.sort(arr1);
    
    System.out.println(Arrays.toString(arr1));
    }
    
}
