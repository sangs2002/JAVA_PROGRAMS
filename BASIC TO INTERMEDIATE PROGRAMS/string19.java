import java.util.Scanner;

public class string19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING:");
        String chr = sc.next();
        char sym[]=chr.toCharArray();
        
        int count=0;

        for (int i = 0; i < chr.length(); i++) {
            if(sym[i]>=33 && sym[i]<=47){
                count++;
            }
            else if(sym[i]>=58 && sym[i]<=64)
            {
                count++;
            }
        }
        System.out.println(count);
        
    }
    
}
//gasgg54@#vscsd!s*