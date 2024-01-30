class Boss extends GameEntity {
    private Weapon weapon;

    // Геттеры и сеттеры для оружия
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // Метод для печати информации
    public String printInfo() {
        return "Boss Info:\n" +
                "Health: " + getHealth() + "\n" +
                "Damage: " + getDamage() + "\n" +
                "Weapon Type: " + weapon.getWeaponType() + "\n" +
                "Weapon Name: " + weapon.getWeaponName();
    }
}

