public class Employe extends Salarie {
    private double hsupp;
    private double phsupp;

    Employe(double hsupp,double phsupp,int mat,String nom,double recru){
        super(mat,nom,recru);
        this.hsupp=hsupp;
        this.phsupp=phsupp;
    }
    double gethsupp(){
        return this.hsupp;
    }
    double getphsupp(){
        return this.phsupp;
    }
    void sethsupp(double hsupp){
        this.hsupp=hsupp;
    }
    void setphsupp(double phsupp){
        this.phsupp=phsupp;
    }

    void afficher(){
        super.afficher();
        System.out.println("les heures supplémentaires : " + hsupp+ " le prix d'heure supplémentaire : " + phsupp);
    }
}
