public class Potion extends Item implements Stackable, Equipable, Consumable{
    public Potion(int id, String description, double weight, String name) {
        super(id, description, weight, name);
    }

    @Override
    public void consumeItem() {
        System.out.printf("%s has been consumed!\n", this.getName());
    }

    @Override
    public void equip() {
        System.out.printf("%s has been equipped!\n", this.getName());
    }

    @Override
    public void stackItem() {
        System.out.printf("Stack with %s has been increased!\n", this.getName());
    }
}
