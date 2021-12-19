public class BackpackSlot extends Slot{
    private Item item;

    public BackpackSlot(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}
