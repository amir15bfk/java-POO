
public class Exo1 {
    public static void main(String [] args){
    Paire  e1 = new Paire(1,2);
    e1.afficher() ;
    Paire  e2 = new Paire();
    e2.afficher() ;
    Paire  e3 = new Paire(e1);
    e3.afficher() ;
    e3.setP1(5);
    e3.setP2(6);
    e3.afficher();
    System.out.println("("+e3.getP1()+","+e3.getP2()+")");
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
    public void afficher(){
        System.out.println("("+p1+","+p2+")");
    }
    public void setP1(int p1){
        this.p1=p1;
    }
    public void setP2(int p2){
        this.p2=p2;
    }
    public int getP1(){
        return this.p1;
    }
    public int getP2(){
        return this.p2;
    }
}