import java.util.Scanner;

public class pipesum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE INPUTS:");
        int no_of_input,no_of_output,rust;
        no_of_input=scan.nextInt();
        no_of_output=scan.nextInt();
        rust=scan.nextInt();

        System.out.println("ENTER THE ARRAY 1:");
        int arr1[]=new int[no_of_input];
        
        int temp=0;
        int temp2=0;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=scan.nextInt();
        }
        System.out.println("ENTER THE ARRAY 2:");
        int arr2[]=new int[no_of_output];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=scan.nextInt();
        }
        
        for (int i = 0; i <no_of_input; i++) {
            
                temp+=arr1[i];
               }
                
            
        
        for (int i = 0; i <no_of_output; i++) {
        
                temp2+=arr2[i];
               }
                


        if(temp==temp2){
            System.out.println("BALANCED");
        }
        else if(temp>temp2){
            System.out.println((temp2-temp)-rust);
        }
        else
        {
            System.out.println((temp2-temp)+rust);
        }

        



    }
    
}
