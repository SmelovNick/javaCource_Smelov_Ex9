public class ActiveSlot <T extends Equipable & Consumable> extends Slot{
    private T item;

    public ActiveSlot(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

}
