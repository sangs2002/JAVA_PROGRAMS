import java.util.Scanner;

public class twoddouble{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE:");
        int size=sc.nextInt();
        System.out.println("ENTER THE FLAG:");
        int flag= sc.nextInt();

        System.out.println("ENTER THE 2D MATRIX ARRAY:");
        int array[][]=new int [size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j]=sc.nextInt();
            }
        }
        if(flag==1){
        int temp=0;
        for (int i = 0; i < array.length; i++) {
        for (int j = i; j < array.length; j++) {
            temp=array[i][j];
            array[i][j]=array[j][i];
            array[j][i]=temp;
        }
    }

    
    int temp2=0;

        for (int i = 0; i < array.length; i++) {
            int low =0;
            int high=size-1;

            while(low<high){
              
                temp2=array[i][low];
                array[i][low]=array[i][high];
                array[i][high]=temp2;
                low++;
                high--;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
    }
    else {

        for(int k=0;k<2;k++){
        int temp3=0;
        for (int i = 0; i < array.length; i++) {
        for (int j = i; j < array.length; j++) {
        
            temp3=array[i][j];
            array[i][j]=array[j][i];
            array[j][i]=temp3;
        }
    }
    int temp4=0;
     for (int i = 0; i < array.length; i++) {
        
            int low =0;
            int high=size-1;

            while(low<high){
              
                temp4=array[low][i];
                array[low][i]=array[high][i];
                array[high][i]=temp4;
                low++;
                high--;
            }
        }
    }
}
    System.out.println("left rotation of 90*");
    for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
    

    }

    }


