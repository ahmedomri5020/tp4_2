public class Salarie {
    private int matricule;
    private String nom;
    private double recrutement;

Salarie(int mat,String nom,double recru) {
    this.matricule=mat;
    this.nom = nom;
    this.recrutement = recru;
}
int getmat(){
    return this.matricule;
}
String getnom(){
    return this.nom;
}
double getRecrutement(){
    return this.recrutement;
}
void setmat(int mat){
    this.matricule=mat;
}
void setnom(String nom){
    this.nom=nom;
}
void setrecru(double recru){
    this.recrutement=recru;
    }
void afficher(){
    System.out.println("matricule :" + this.matricule+ " nom : " +this.nom+ " date de recruitement " + this.recrutement);
}
int salaire(){
    if(recrutement<2005){
        return 400;
    }
    else{
        return 280;
    }
}

    @Override
    public String toString() {
        return "Salarie{" +
                "matricule=" + matricule +
                ", nom='" + nom + '\'' +
                ", recrutement=" + recrutement +
                '}';
    }
}
