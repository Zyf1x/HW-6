public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);

        Weapon bossWeapon = new Weapon();
        bossWeapon.setWeaponType(WeaponType.SWORD);
        bossWeapon.setWeaponName("Excalibur");
        boss.setWeapon(bossWeapon);

        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(150);
        skeleton1.setDamage(20);

        Weapon skeletonWeapon1 = new Weapon();
        skeletonWeapon1.setWeaponType(WeaponType.BOW);
        skeletonWeapon1.setWeaponName("Longbow");
        skeleton1.setWeapon(skeletonWeapon1);

        skeleton1.setArrowCount(30);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(120);
        skeleton2.setDamage(18);

        Weapon skeletonWeapon2 = new Weapon();
        skeletonWeapon2.setWeaponType(WeaponType.AXE);
        skeletonWeapon2.setWeaponName("Battleaxe");
        skeleton2.setWeapon(skeletonWeapon2);

        skeleton2.setArrowCount(25);

        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());
    }
}
