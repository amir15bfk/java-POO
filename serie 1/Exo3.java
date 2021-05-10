import java.util.Scanner; 
class Exo3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("give me the first number (A) : ");
        int A = sc.nextInt();
        System.out.print("give me the second number (B) : ");
        int B = sc.nextInt();
        if (A<=B) {System.out.println("A ("+A+") est le plus petite");}
        else  {System.out.println("B ("+B+") est le plus petite");}
        //i can use min = A<B ? A:B; to find the min
    }
}