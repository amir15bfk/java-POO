
public class Exo1 {
    public static void main(String [] args){
    Paire  e1 = new Paire(1,2);
    e1.affiche() ;
    Paire  e2 = new Paire();
    e2.affiche() ;
    Paire  e3 = new Paire(e1);
    e3.affiche() ;
    e3.setP1(5);
    e3.setP2(6);
    e3.affiche() ;
    } 

}
class Paire {
    private int p1,p2;
    public Paire(int p1,int p2) {
        this.p1=p1;
        this.p2=p2;
    }
    public Paire() {
        p1=0;
        p2=0;
    }
    public Paire(Paire p) {
        p1=p.p1;
        p2=p.p2;
    }
    public void affiche(){
        System.out.println("("+p1+","+p2+")");
    }
    public void setP1(int x){
        p1=x;
    }
    public void setP2(int x){
        p2=x;
    }
}