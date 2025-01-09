import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ingredientNom;
        double ingredientQuantite;
        String ingredientUnite;

        System.out.println("Veuillez entrer un type d'ingrédient : ");
        ingredientNom = sc.nextLine();
        System.out.println("Veuillez entrer une unité de mesure : ");
        ingredientUnite = sc.nextLine();
        System.out.println("Veuillez entrer une quantite : ");
        ingredientQuantite = sc.nextDouble();
        sc.nextLine();

        Ingredient ingredient = new Ingredient(
                ingredientNom,
                ingredientQuantite,
                ingredientUnite
        );

        System.out.println(ingredient.getNom());
        System.out.println(ingredient.getQuantite());
        System.out.println(ingredient.getUnite());

        System.out.println(ingredient.afficher());

        System.out.println("Veuillez saisir une nouvelle quantité");
        ingredient.setQuantite(sc.nextDouble());

        System.out.println(ingredient.afficher());
    }
}
