import java.util.Scanner;

public class DiamondShape{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        // Upper Half for dry run take n=5
         for( int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");

            }
           int  stars = n-i;
           for(int m=1;m<=stars;m++){
            System.out.print("* ");
           }System.out.println("");
        }
        // Lower Half
         for( int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");

            }
           int  stars = n-i;
           for(int m=1;m<=stars;m++){
            System.out.print("* ");
           }System.out.println("");
        }


        
        scanner.close();

    }
    
}
