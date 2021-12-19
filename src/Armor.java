public abstract class Armor extends Equipment implements Equipable{
    private int physicalDefense;
    private int magicalDefense;

    public Armor(int id, String description, double weight, String name, int physicalDefense, int magicalDefense) {
        super(id, description, weight, name);
        this.physicalDefense = physicalDefense;
        this.magicalDefense = magicalDefense;
    }

    public int getPhysicalDefense() {
        return physicalDefense;
    }

    public void setPhysicalDefense(int physicalDefense) {
        this.physicalDefense = physicalDefense;
    }

    public int getMagicalDefense() {
        return magicalDefense;
    }

    public void setMagicalDefense(int magicalDefense) {
        this.magicalDefense = magicalDefense;
    }

}
