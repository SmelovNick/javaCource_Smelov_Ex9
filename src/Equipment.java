public abstract class Equipment extends Item implements Equipable{
    public Equipment(int id, String description, double weight, String name) {
        super(id, description, weight, name);
    }
    @Override
    public void equip() {
        System.out.printf("%s has been equipped!\n", this.getName());
    }
}
