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
    public static int recherchercheMin(int [] T,int n){  
        int min = T[0];
        for (int i = 0 ;i<n;i++){
            if (T[i]<min){
                min = T[i];
            }
            
        }
        
        return min;
    }
    public static int recherchercheMax(int [] T,int n){  
        int max = T[0];
        for (int i = 0 ;i<n;i++){
            if (T[i]>max){
                max = T[i];
            }
            
        }
        
        return max;
    }
    public static int somme(int [] T,int n){
        if (n==1) return T[0];
        else return T[n-1]+somme(T,n-1);
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


        System.out.println("recherchercheMin : ");
        int min1 = recherchercheMin(T1,n);
        int min2 = recherchercheMin(T2,n);
        int min3 = recherchercheMin(T3,n);
        System.out.println("min de T1 = "+min1);
        System.out.println("min de T2 = "+min2);
        System.out.println("min de T3 = "+min3);


        System.out.println("recherchercheMax : ");
        int max1 = recherchercheMax(T1,n);
        int max2 = recherchercheMax(T2,n);
        int max3 = recherchercheMax(T3,n);
        System.out.println("max de T1 = "+max1);
        System.out.println("max de T2 = "+max2);
        System.out.println("max de T3 = "+max3);


        System.out.println("somme : ");
        int s1 = somme(T1,n);
        int s2 = somme(T2,n);
        int s3 = somme(T3,n);
        System.out.println("somme de T1 = "+s1);
        System.out.println("somme de T2 = "+s2);
        System.out.println("somme de T3 = "+s3);

    }
    
}