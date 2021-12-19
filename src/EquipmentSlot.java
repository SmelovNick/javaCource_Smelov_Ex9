public class EquipmentSlot <T extends Equipment> extends Slot{
    private T item;

    public EquipmentSlot(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
