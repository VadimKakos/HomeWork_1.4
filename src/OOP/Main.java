package OOP;

public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("Трава", "Африка", 10, " Gaz", 7);
        Herbivores giraffe = new Herbivores("Трава", "Африка", 13, " gir", 9);
        Herbivores horse = new Herbivores("Трава", "Казахстан", 19, " hor", 4);
        Herbivores hyena = new Herbivores("Падаль", "Африка", 14, " hye", 3);
        Herbivores tiger = new Herbivores("Мясо", "Африка", 20, " tie", 11);
        Herbivores beer = new Herbivores("Ягоды", "Россия", 20, " bee", 9);
        Amphibians frog = new Amphibians("Россия", "fro", 3);
        anFlying peacock = new anFlying(false, "fro", "Индия", 4);
        anFlying penguin = new anFlying(false,"pen полюс", "Северный", 3);
        anFlying dodo = new anFlying(false,"do", "Маврикий", 2);
        Flying chaika = new Flying(true,"cha", "Россия", 1);
        Flying albatross = new Flying(true,"alba", "Антарктида", 4);
        Flying falcon = new Flying(true,"fal", "США", 6);


        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(beer);
        System.out.println(frog);
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodo);
        System.out.println(chaika);
        System.out.println(albatross);
        System.out.println(falcon);

        System.out.println(gazelle.equals(giraffe));
        System.out.println(gazelle.equals(horse));
    }
}