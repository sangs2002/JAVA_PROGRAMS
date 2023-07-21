import java.util.Arrays;
import java.util.Scanner;

public class mergesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE ARRAY SIZE:");
        int size = sc.nextInt();

        System.out.println("ENTER THE ARRAY 1:");
        int arr1[]=new int[size];
        int j=0;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
        }
         System.out.println("ENTER THE ARRAY 2:");
        int arr2[]=new int[size];
         for (int i = 0; i < arr2.length; i++) {
            arr2[i]=sc.nextInt();
        }
        int arr3[]=new int[arr1.length+arr2.length];
        
        for (int i = 0; i <arr1.length+arr2.length ; i++) {
            
                if(arr1.length>i){
                    arr3[i]=arr1[i];
                }
                else{
                    arr3[i]=arr2[j];
                    j++;
                }
                System.out.println(arr3[i]);
            }
            System.out.println("THE ARRAY BEFORE SORT->");
            System.out.println(Arrays.toString(arr3));
            System.out.println("After sort");
            Arrays.sort(arr3);
        
        System.out.println(Arrays.toString(arr3));
        }

    }
    

