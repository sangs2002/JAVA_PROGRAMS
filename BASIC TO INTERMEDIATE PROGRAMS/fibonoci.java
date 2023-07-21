import java.util.Scanner;

public class fibonoci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE:");
        int size = sc .nextInt();
        System.out.println("ENTER THE INPUTS:");
        int n1=0;
        int n2=1;
        int n3;
System.out.print(n1+" "+n2);
        for (int i = 2; i < size; i++) {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            
        }
    }
    
}
