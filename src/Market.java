public class Market {

    Hero hero;

    public static Hero buyPotion(Hero hero) {
        int price = 20;
        hero.buyAndHeal(price);
        return hero;
    }
}
