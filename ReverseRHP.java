import java.util.Scanner;

public class ReverseRHP {
   public static void main(String args[]){

    System.out.print("Enter the no of iterations: ");
    //System.out.println();
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    for(int i=0; i<n; i++){
        for(int j=i; j<n; j++){
            System.out.print('*');
        }
        System.out.println();
    }
   scan.close();
   } 
}
