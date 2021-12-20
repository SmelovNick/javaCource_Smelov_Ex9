import java.util.Objects;

public class Shield extends Weapon implements Cloneable{
    public Shield(int id, String description, double weight, String name, int physicalDamage, int magicalDamage) {
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
        Shield shield = (Shield) obj;
        return this.getId() == shield.getId() && this.getDescription().equals(shield.getDescription()) &&
                this.getWeight() == shield.getWeight() && this.getName().equals(this.getName())  &&
                this.getPhysicalDamage() == shield.getPhysicalDamage()&& this.getMagicalDamage() == shield.getMagicalDamage();
    }

    @Override
    protected Shield clone() throws CloneNotSupportedException {
        return (Shield) super.clone();
    }

    @Override
    public String toString() {
        return "Shield{id=" + this.getId() + ", name = " + this.getName() + ", description=" + this.getDescription()+
                ", weight = " + this.getWeight() + ", physical damage = " + this.getPhysicalDamage() +
                ", magical damage = " + this.getMagicalDamage() + "}";
    }
}






















