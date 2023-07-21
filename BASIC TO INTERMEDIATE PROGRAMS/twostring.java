import java.util.Scanner;

public class twostring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING 1:");
        String sang1 = sc.next();
        char sang2[]=sang1.toCharArray();

         System.out.println("ENTER THE STRING 2:");
         String sang3 = sc.next();
         char sang4[]=sang3.toCharArray();

         int hold=sang1.compareTo(sang3);
         //int count;
         if(hold==0){
                      System.out.println("0");
                }
        else{
            int count=0;
            for (int i = 0; i < sang2.length; i++) {
            int c=0;
            for (int j = 0; j < sang4.length; j++) {
               if(c==0)
         if(sang2[i]==sang4[j]){

            c=1;
         }
         else{
            count++;
         }
               
            }   
            
         }
         System.out.println(count);
        
    }
    
}
}
