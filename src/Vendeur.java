public class Vendeur extends Salarie {
    private double vente;
    private double pourcentage;


    Vendeur(double vente,double pourcentage,int mat,String nom,double recru){
        super(mat,nom,recru);
        this.vente=vente;
        this.pourcentage=pourcentage;
    }
    double getvente(){
        return this.vente;
    }
    double getpourcentage(){
        return this.pourcentage;
    }
    void setvente(double vente){
        this.vente=vente;
    }
    void setpourcentage(double pourcentage){
        this.pourcentage=pourcentage;
    }

    void afficher(){
        super.afficher();
        System.out.println(this.vente+this.pourcentage);
    }


}
