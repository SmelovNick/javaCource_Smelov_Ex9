import java.util.Objects;

public class Sword extends Weapon implements Cloneable{

    public Sword(int id, String description, double weight, String name, int physicalDamage, int magicalDamage) {
        super(id, description, weight, name, physicalDamage, magicalDamage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getDescription(), this.getWeight(),
                this.getName(), this.getPhysicalDamage(), this.getMagicalDamage());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || obj.getClass() != this.getClass()) return false;
        Sword sword = (Sword) obj;
        return this.getId() == sword.getId() && this.getDescription().equals(sword.getDescription()) &&
                this.getWeight() == sword.getWeight() && this.getName().equals(this.getName())  &&
                this.getPhysicalDamage() == sword.getPhysicalDamage()&& this.getMagicalDamage() == sword.getMagicalDamage();
    }

    @Override
    protected Sword clone() throws CloneNotSupportedException {
        return (Sword) super.clone();
    }

    @Override
    public String toString() {
        return "Sword{id=" + this.getId() + ", name = " + this.getName() + ", description=" + this.getDescription()+
                ", weight = " + this.getWeight() + ", physical damage = " + this.getPhysicalDamage() +
                ", magical damage = " + this.getMagicalDamage() + "}";
    }
}
