import java.util.Scanner;

public class pratice19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE:");
        int size = sc.nextInt();

        System.out.println("ENTER THE ARRAY:");
        int array[]=new int[size];
        int store;

        for (int i = 0; i < size; i++) {
            
            array[i]=sc.nextInt();
        }
        
        int temp=0;
//dec to acen
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            
        }
              store=array[0]+array[1];
            System.out.println(store);
        

    }
    
}
