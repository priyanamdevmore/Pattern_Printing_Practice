import java.util.Scanner;
public class Butterfly{
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
       int n=scanner.nextInt();
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");

        }
    
       int spaces =2 * (n-i);
       for(int j=1;j<=spaces;j++){
        System.out.print(" ");
       }
       for(int j=1;j<=i;j++){
        System.out.print("*");
       }
       
       System.out.println();
    }

     for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");

        }
    
       int spaces=2 * (n-i);
       for(int j=1;j<=spaces;j++){
        System.out.print(" ");
       }
       for(int j=1;j<=i;j++){
        System.out.print("*");
       }
       
       System.out.println();

    }scanner.close();
}
}
