public class Entreprise {
    public static void main(String[] args) {
        Salarie[] tab = new Salarie[5];
        Employe w = new Employe(15, 4, 12345, "walid", 2002);
        Employe a = new Employe(19, 5, 87698, "aymen", 2003);
        Employe k = new Employe(7, 4, 12345, "khaled", 2008);
        Vendeur y = new Vendeur(1000, 0.1, 23445, "yessine", 2007);
        Vendeur n = new Vendeur(2000.700, 0.1, 65478, "nassime", 2000);
        tab[0] = w;
        tab[1] = a;
        tab[2] = k;
        tab[3] = y;
        tab[4] = n;
        for (int i = 0; i < 5; i++) {
            tab[i].afficher();
        }
        System.out.println("------------------------------ ");
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] instanceof Vendeur) {
                tab[i].afficher();
            }
        }
        System.out.println("------------------------------ ");
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] instanceof Employe) {
                tab[i].afficher();
            }
        }
        System.out.println("------------------------------ ");
        double ancien = tab[0].getRecrutement();
        int indice = 0;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i].getRecrutement() < ancien) {
                indice = i;
                ancien = tab[i].getRecrutement();
            }
        }
        System.out.println(tab[indice]);
    }

}
