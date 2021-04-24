import java.util.Scanner;
class Exo2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("give me a real : ");
        float x = sc.nextFloat();
        if (x<0)
            System.out.println("abs("+x+") = "+(-x));
         else System.out.println("abs("+x+") = "+(x));
    }
}