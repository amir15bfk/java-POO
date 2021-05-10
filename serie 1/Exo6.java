class Exo6{
    public static void main(String args []){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        afficherEQT(a,b,c);
        if (b == 0 && a == 0) System.out.println ("No solution");
        else {
        if (a == 0) System.out.println ("X = "+(-c/b));
        else {
        int d = delta(a,b,c);
        if (d>0){
            System.out.println ("X_1 = "+racine1(a,b,d));
            System.out.println ("X_2 = "+racine2(a,b,d));
        } else if (d==0) {
            System.out.println ("X = "+racine1(a,b,d));
        } else
            System.out.println("No Solution for this equation in the real numbers");
            }
        }
    }
    public static void afficherEQT(int a,int b,int c){
        System.out.println(a+"*x*x+"+b+"*x+"+c+" = 0");
    }
    public static int delta(int a,int b,int c){
        return b*b-4*a*c;
    }
    public static double racine1(int a,int b,float d){
        return (double)(-b+Math.sqrt(d))/(double)(2*a);
    }
    public static double racine2(int a,int b,float d){
        return (double)(-b-Math.sqrt(d))/(double)(2*a);
    }
}