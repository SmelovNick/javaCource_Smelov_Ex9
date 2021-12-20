import java.util.Objects;

public class Helmet extends Armor implements Cloneable{
    public Helmet(int id, String description, double weight, String name, int physicalDefense, int magicalDefense) {
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
        Helmet helmet = (Helmet) obj;
        return this.getId() == helmet.getId() && this.getDescription().equals(helmet.getDescription()) &&
                this.getWeight() == helmet.getWeight() && this.getName().equals(this.getName())  &&
                this.getPhysicalDefense() == helmet.getPhysicalDefense()&& this.getMagicalDefense() == helmet.getMagicalDefense();
    }

    @Override
    protected Sword clone() throws CloneNotSupportedException {
        return (Sword) super.clone();
    }

    @Override
    public String toString() {
        return "Helmet{id=" + this.getId() + ", name = " + this.getName() + ", description=" + this.getDescription()+
                ", weight = " + this.getWeight() + ", physical damage = " + this.getPhysicalDefense() +
                ", magical damage = " + this.getMagicalDefense() + "}";
    }

}
