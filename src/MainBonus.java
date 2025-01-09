import java.util.ArrayList;
import java.util.Scanner;

public class MainBonus {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Ingredient> listeIngrediens = new ArrayList<Ingredient> ();

    public static void main(String[] args) {

        String choix;
        String ingredientNom;
        double ingredientQuantite;
        String ingredientUnite;
        boolean stop = false;
        String choixDeux;
        int index;
        String choixTrois;

        do {
            System.out.println("Bienvenu, que voulez vous faire ?\n \t1 - Ajouter/Remplacer un ingrédient\n \t2 - Afficher la liste des ingrédients\n \t3 - Quitter");
            choix = sc.nextLine();
            switch (choix) {
                case "1":

                    System.out.println("1 - Ajouter un ingrédient\n2 - Remplacer un ingrédient");
                    choixTrois = sc.nextLine();
                    switch (choixTrois) {
                        case "1":
                            ajout(choixTrois);
                            break;
                        case "2":
                            if (listeIngrediens.isEmpty()) {
                                System.out.println("votre liste est vide !");
                            }
                            else {
                                ajout(choixTrois);
                            }

                    }
                    break;
                case "2":
                    for (int i = 0; i < listeIngrediens.size(); i++) {
                        System.out.println(i+1 +" - "+ listeIngrediens.get(i).afficher());
                    }
                    System.out.println("Que voulez vous faire ?\n \t1 - Supprimer un ingrédien \n \t2 - Remplacer un ingrédien\n \t3 - Changer la quantité\n \t4 - Quitter");
                    choixDeux = sc.nextLine();
                    switch (choixDeux) {
                        case "1":
                            System.out.println("Quelle ingrédien voulez-vous supprimer ?");
                            listeIngrediens.remove(sc.nextInt()-1);
                            sc.nextLine();
                            break;
                        case "2":
                            break;
                        case "3":
                            System.out.println("De quelle ingrédiens voulez vous modifier la quantité ? (entrez l'index attribué)");
                            index = sc.nextInt();
                            System.out.println("Quelle quantité voulez vous mettre ?");
                            listeIngrediens.get(index-1).setQuantite(sc.nextInt());
                            sc.nextLine();

                            break;
                    }

                    break;
                case "3":
                    stop = true;
                    break;

            }
        }while (!stop);
    }

    public static void ajout(String choixTrois) {

        System.out.println("Veuillez entrer un type d'ingrédient : ");
        String ingredientNom = sc.nextLine();
        System.out.println("Veuillez entrer une unité de mesure : ");
        String ingredientUnite = sc.nextLine();
        System.out.println("Veuillez entrer une quantite : ");
        double ingredientQuantite = sc.nextDouble();
        sc.nextLine();
        Ingredient ingredient = new Ingredient(
                ingredientNom,
                ingredientQuantite,
                ingredientUnite
        );

        switch (choixTrois) {
            case "1":
                System.out.println(ingredient.afficher());
                listeIngrediens.add(ingredient);
                System.out.println("Ingrédient bien retenu !");
                break;
            case "2":
                for (int i = 0; i < listeIngrediens.size(); i++) {
                    System.out.println(i + 1 + " - " + listeIngrediens.get(i).afficher());
                }
                System.out.println("Veuillez entrer l'ingrédient à remplacer : ");
                listeIngrediens.set(listeIngrediens.size() - 1, ingredient);
                break;
        }
    }
}
