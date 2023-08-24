import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i = 0;
        Scanner scan = new Scanner(System.in);

        int n= scan.nextInt() ;
       /* while (i<n){
            System.out.println("hi".formatted(i++));
        }*/
        String integer;
        do{
            System.out.print("enter number");
            integer=scan.next();
            if(integer.indexOf(",")!=-1) System.out.println("enter correct number");
        }while(integer.indexOf(",")!=-1);
        System.out.println(integer);

    }
}