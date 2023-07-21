 class matrix {
    public static void main(String args[]){

        int a[][]={{1,2,3},{4,5,6}};
            int b[][]={{8,4,5},{6,6,9}};

            int c[][]=new int [3][3];

            for(int i=0;i<=5;i++){
                for(int j=0;j<=5;j++){
                    c[j][i]=(a[i][j]+b[i][j]);
                }

                }

            for(int i=0;i<=6;i++){
                for(int j=0;j<=6;j++){
                    System.out.println(" "+c[j][i]);
                }
            }

    }
}
