import java.util.Arrays;
import java.util.Scanner;

public class roadsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE TOTAL_NO_OF_PATH:");
        int tot_path=sc.nextInt();

        System.out.println("ENTER THE ARRAY OF PATH:");
        int path[]=new int[tot_path];
        int temp=0;

        
        for (int i = 0; i < path.length; i++) {
            path[i]=sc.nextInt();
        }
        int pos=path[0];
        int count=1;
        for (int i = 1; i < path.length; i++) {
            if(pos==path[i]){
                count++;
            }
            if(tot_path-count==0){
                System.out.println("EQUAL");
            }
        
        }
        for (int i = 0; i < path.length; i++) {
            for (int j = i+1; j < path.length; j++) {
                if(path[i]>path[j]){
                    temp=path[i];
                    path[i]=path[j];
                    path[j]=temp;
                }
            }
        }
        System.out.println(path[0]+" "+path[1]);

    }
    
}
