public class InvertedTriangle {
    public static void main(String[] args){
        int row=5;
            for (int i=1;i<=row;i++) {
                for (int j=1;j<=i;j++) {
                    System.out.print(" ");
                }
                for (int k=row;k>=i;k--){
                    System.out.print("*");
                }
                for (int l=row-1;l>=i;l--) {

                    System.out.print( "*");
                }
                System.out.println();

            }

    }
}
