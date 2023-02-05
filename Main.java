public class Main {
    public static void main(String[] args) {


        Item item = new Item( "Item name", "Item description", 10);
        Gold goldBar = new Gold( 10);

        Weapon weapon = new Weapon( "super weapon", "super 2 weapon", 10, 50);
        weapon.setDamage(40);
        int dvalue = weapon.getDamage();

        Sword magicSword = new Sword();

        Pillow softPillow = new Pillow();

        Mace bigMace = new Mace();

        Arrow arrow = new Arrow();

        Enemy enemy = new Enemy( "Enemy name", 10,10 );
        Ogre greenOgre = new Ogre ();
        Ogre redOgre = new Ogre();

        Zombie slowZombie = new Zombie();
        Zombie fastZombie = new Zombie();

        Dog spotDog = new Dog();

        GiantSpider giantSpider = new GiantSpider();

        Wolf angelawolf = new Wolf();




    }
}





