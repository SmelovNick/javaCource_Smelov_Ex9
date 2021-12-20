import java.util.Objects;

public class Potion extends Item implements Stackable, Equipable, Consumable, Cloneable{
    public Potion() {
    }

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

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getName(), this.getDescription(), this.getWeight());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || obj.getClass() != this.getClass()) return false;
        Potion potion = (Potion) obj;
        return this.getId() == potion.getId() &&
                this.getName().equals(potion.getName()) &&
                this.getDescription().equals(potion.getDescription()) &&
                this.getWeight() == potion.getWeight();
    }

    @Override
    protected Potion clone() throws CloneNotSupportedException {
        return (Potion)super.clone();
    }

    @Override
    public String toString() {
        return "Potion{id=" + this.getId() + ", name=" + this.getName() +
                ", description=" + this.getDescription() + ", weight=" + this.getWeight() + "}";
    }
}
