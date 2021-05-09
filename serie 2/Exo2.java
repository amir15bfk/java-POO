public class Exo2 {
    public static void main(String [] args){
        Complexe n1 = new Complexe(1,3);
        Complexe n2 = new Complexe(6.5f,1);
        n1.afficher();
        n2.afficher();
        Complexe add = n1.plusComplexe(n2);
        Complexe sub = n1.moinsComplexe(n2);
        add.afficher();
        sub.afficher();
        Complexe n3 = new Complexe(1,3);
        System.out.println(n1.equals(n2));
        System.out.println(n1.equals(n3));
    }
}
class Complexe {
    private float PartieRéelle;
    private float PartieImaginaire;
    public Complexe(float PartieRéelle,float PartieImaginaire){
        this.PartieRéelle = PartieRéelle;
        this.PartieImaginaire = PartieImaginaire;
    }
    public Complexe(){
        //vide
    }
    public Complexe plusComplexe(Complexe arg){
        return new Complexe(this.PartieRéelle+arg.PartieRéelle,this.PartieImaginaire+arg.PartieImaginaire);
    }
    public Complexe moinsComplexe(Complexe arg){
        return new Complexe(this.PartieRéelle-arg.PartieRéelle,this.PartieImaginaire-arg.PartieImaginaire);
    }
    public void afficher(){
        System.out.println(PartieRéelle+" + "+PartieImaginaire+" * i");
    }
    public boolean equals(Complexe arg){
        if (this.PartieRéelle==arg.PartieRéelle && this.PartieImaginaire==arg.PartieImaginaire) return true;
        else return false;
    }

}
