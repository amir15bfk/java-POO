import java.util.Scanner; 
class Exo5 {
    public static float harm(int n){
        float s = 0;
        for (int i = 1 ;i<=n;i++){
            s+=(float)1/i;
        }
        return s;
    }
    public static void main(String [] args){
        int n;
        Scanner sc = new Scanner(System.in);
        do {
        System.out.print("give me n : ");
        n = sc.nextInt();
        }while(n<=0);
        sc.close();
        if (n == 1)
        System.out.println("1/1 = "+harm(n));
        else if (n == 2)
        System.out.println("1+1/2 = "+harm(n));
        else if (n == 3)
        System.out.println("1+1/2+1/3 = "+harm(n));
        else
        System.out.println("1+1/2+...+1/"+n+" = "+harm(n));
    }
    
}