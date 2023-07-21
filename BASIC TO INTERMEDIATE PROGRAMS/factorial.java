import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE SIZE:");
        int size = sc.nextInt();

        int fact=1;
        int count=0;

        for (int i = 1; i <=size; i++) {
            fact=fact*i;
        }

        char array[]=String.valueOf(fact).toCharArray();

        for (int i = 0; i < array.length; i++) {
            if(array[i]==48){
                count++;
            }
        }
        System.out.println(count);



    }
    
}
