import java.util.Scanner; 
class Exo4 {
    public static int fact(int n){
        int s = 1;
        for (int i = 2 ;i<=n;i++){
            s=s*i;
        }
        return s;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("give me n : ");
        int n = sc.nextInt();
        System.out.println(n+"! = "+fact(n));
        
    }
    
}