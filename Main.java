public class Main {
    public static void main(String[] args) {

        Item item = new Item( "item name", "item description", 10);

        Gold gold = new Gold(10);

        Weapon weapon = new Weapon("super weapon", "super 2 weapon", 10, 50);
        weapon.setDamage(40);
        int dvalue = weapon.getDamage();

        Sword sword = new Sword();

        Pillow pillow = new Pillow();

        Mace mace = new Mace();

        Arrow arrow = new Arrow();


    }
}