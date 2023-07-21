import java.util.Arrays;
import java.util.Scanner;

public class ascdec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE:");
        int size = sc.nextInt();
        int count=0,count2=0;
        System.out.println("ENTER THE ARRAY:");
        int array[]=new int[size];

int temp3[]=new int [size];
        for (int i = 0; i < size; i++) {
            array[i]= sc.nextInt();
        }
        int k=0;
        int p=0;
         for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
                
                count++;
            }
            else
            {
                
                count2++;
            }
            
        }
        int temp1[]=new int[count];
int temp2[]=new int[count2];
        for (int i = 0; i < size; i++) {
            if(array[i]%2!=0){
                temp1[k]=array[i];
                k++;
                
            }
            else
            {
                temp2[p]=array[i];
                p++;
                
            }
        }
        //Arrays.sort(temp1);
        //Arrays.sort(temp2);
        int temp5=0;
        for (int i = 0; i < count; i++) {
            for (int j = i+1; j < count; j++) {
                //dec to ace
                if(temp1[i]>temp1[j]){
                    temp5=temp1[i];
                    temp1[i]=temp1[j];
                    temp1[j]=temp5;

                }
                
            }
            
        }
int temp4=0;
        for (int i = 0; i < count2; i++) {
            for (int j = i+1; j < count2; j++) {
                if(temp2[i]<temp2[j]){
                    temp4=temp2[i];
                    temp2[i]=temp2[j];
                    temp2[j]=temp4;

                }
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(temp1[i]);  
        }
        for (int i = 0; i < count2; i++) {
            System.out.println(temp2[i]);
        }
    }
    
}
