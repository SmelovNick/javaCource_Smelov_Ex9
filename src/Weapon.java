public abstract class Weapon extends Equipment {
    private int physicalDamage;
    private int magicalDamage;

    public Weapon(int id, String description, double weight, String name, int physicalDamage, int magicalDamage) {
        super(id, description, weight, name);
        this.physicalDamage = physicalDamage;
        this.magicalDamage = magicalDamage;
    }

    public int getPhysicalDamage() {
        return physicalDamage;
    }

    public void setPhysicalDamage(int physicalDamage) {
        this.physicalDamage = physicalDamage;
    }

    public int getMagicalDamage() {
        return magicalDamage;
    }

    public void setMagicalDamage(int magicalDamage) {
        this.magicalDamage = magicalDamage;
    }
}
