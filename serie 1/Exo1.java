import java.util.Scanner; 
class Exo1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("give me the first number : ");
        int x = sc.nextInt();
        System.out.print("give me the second number : ");
        int y = sc.nextInt();
        System.out.println(x+" * "+y+" = "+(x*y));
        
    }
}