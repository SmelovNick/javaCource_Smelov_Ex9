import java.util.Objects;

public class Chest extends Armor implements Cloneable{
    public Chest(int id, String description, double weight, String name, int physicalDefense, int magicalDefense) {
        super(id, description, weight, name, physicalDefense, magicalDefense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getDescription(), this.getWeight(),
                this.getName(), this.getPhysicalDefense(), this.getMagicalDefense());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || obj.getClass() != this.getClass()) return false;
        Chest chest = (Chest) obj;
        return this.getId() == chest.getId() && this.getDescription().equals(chest.getDescription()) &&
                this.getWeight() == chest.getWeight() && this.getName().equals(this.getName())  &&
                this.getPhysicalDefense() == chest.getPhysicalDefense()&& this.getMagicalDefense() == chest.getMagicalDefense();
    }

    @Override
    protected Chest clone() throws CloneNotSupportedException {
        return (Chest) super.clone();
    }

    @Override
    public String toString() {
        return "Chest{id=" + this.getId() + ", name = " + this.getName() + ", description=" + this.getDescription()+
                ", weight = " + this.getWeight() + ", physical damage = " + this.getPhysicalDefense() +
                ", magical damage = " + this.getMagicalDefense() + "}";
    }
}
