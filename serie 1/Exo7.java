import java.util.Scanner; 
import java.util.Random;
class Exo7 {
    public static int [] remplissage1(int [] T,int N,int n){
        for (int i = 2 ;i<=n+1;i++){
            T[i-2]=N*i;
        }
        return T;
    }
    public static int [] remplissage2(int [] T,int n){
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ;i<n;i++){
            System.out.print("give me T["+i+"] : ");
            T[i] = sc.nextInt();
        }
        return T;
    }
       
    public static int [] remplissage3(int [] T,int n){
        Random random = new Random();  
        int s = 0;
        for (int i = 0 ;i<n;i++){
            T[i] = random.nextInt(100);
            s +=T[i];
        }
        System.out.println("Somme des element de T = "+s);
        return T;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("give me n : ");
        int n = sc.nextInt();
        System.out.print("give me N : ");
        int N = sc.nextInt();
        int [] T1 = new int [n];
        int [] T2 = new int [n];
        int [] T3 = new int [n];

        System.out.println("remplissage1 : ");
        T1 = remplissage1(T1,N,n);
        for (int i = 0 ;i<n;i++){
            System.out.println("T1["+i+"] : "+T1[i]);;
        }


        System.out.println("remplissage2 : ");
        T2 = remplissage2(T2,n);
        for (int i = 0 ;i<n;i++){
            System.out.println("T2["+i+"] : "+T2[i]);
        }


        System.out.println("remplissage3 : ");
        T3 = remplissage3(T3,n);
        for (int i = 0 ;i<n;i++){
            System.out.println("T3["+i+"] : "+T3[i]);
        }

    }
    
}