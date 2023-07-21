import java.util.*;

  class mat{
           public static void main(String args[]){
                          Scanner num=new Scanner(System.in);
                          System.out.println("enter size:");
                          int n=num.nextInt();
                          int[][] a=new int[n][n]; 
                          int[][] b=new int[n][n];
                         int[][] c=new int[n][n];
                         // int c=10/10; 
                          for(int i=0;i<n;i++){
                            for(int j=0;j<n;j++){
                               System.out.println("enter number:");

                               a[i][j]=num.nextInt(); 
                              }//System.out.println();

                           }                                                                             //|| (i==0 && (j==1 ))|| (i==2 && (j==1))
                                                                                                        //i==1 && (j==0 || j==2))
                         for(int i=0;i<n;i++){
                            for(int j=0;j<n;j++){
                                  if((i==0 && (j==0 || j==2)) || (i==2 && (j==0 || j==2))){
                                     b[i][j]=a[i][j]+a[1][1];
                                    System.out.print( b[i][j]+" ");

                                   }
                               else {
                                     b[i][j]=a[i][j];
                                    System.out.print( b[i][j]+" ");

                                 }
                                
                                
                                           
                              }System.out.println();

                           }    
  for(int i=0;i<n;i++){
     for(int j=0;j<n;j++){
if( i==0 && j==1){
                                     // int c= b[0][0]/10;
                                      if(b[0][0]<10){
                                          System.out.print("S ");
                                      }
                                      else{
                                          System.out.print("D ");
                                      }

                                   
                                 }
                                else if(i==2 && j==1){
                                      //int c= b[2][2]/10;
                                      if(b[2][2]<10){
                                          System.out.print("S ");
                                      }
                                      else{
                                          System.out.print("D ");
                                      }

                                   
                                 }
                                else if(i==1 &&j==0){
                                      //int c= b[2][2]/10;
                                      if(b[2][0]<10){
                                          System.out.print("S ");
                                      }
                                      else{
                                          System.out.print("D ");
                                      }

                                   
                                 }
                              else if( i==1 && j==2 ){
                                      //int c= b[0][2]/10;
                                      if(b[0][2]<10){
                                          System.out.print("S ");
                                      }
                                      else{
                                          System.out.print("D ");
                                      }

                                   
                                 }
                           else{
                             b[i][j]=a[i][j];
                                    System.out.print( b[i][j]+" ");

}
}System.out.println();
}

    }
    }