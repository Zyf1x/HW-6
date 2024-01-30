class Skeleton extends Boss {
    private int arrowCount;

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    @Override
    public String printInfo() {
        return "Skeleton Info:\n" +
                "Health: " + getHealth() + "\n" +
                "Damage: " + getDamage() + "\n" +
                "Weapon Type: " + getWeapon().getWeaponType() + "\n" +
                "Weapon Name: " + getWeapon().getWeaponName() + "\n" +
                "Arrow Count: " + arrowCount;
    }
}
