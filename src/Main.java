public class Main {
    public static void main(String[] args) {
        ActiveSlot[]activeSlots = new ActiveSlot[8];
        EquipmentSlot[]equipmentSlots = new EquipmentSlot[4];
        BackpackSlot[]backpackSlots = new BackpackSlot[10];

        Potion healPotion = new Potion(1, "Зелье, восстанавливающие ОЗ", 0.4, "Зелье здоровья");
        Potion manaPotion = new Potion(6, "Зелье, восстанавливающие ману", 0.4, "Зелье маны");

        Helmet leatherHelmet = new Helmet(2,
                "Кожаный шлем нордийского воина, выделанный из коровьей кожи",
                1.8, "Кожаный шлем нордийского воина", 10, 0);
        Chest leatherChest = new Chest(3,
                "Кожаный нагрудникнордийского воина, выделанный из коровьей кожи",
                1.8, "Кожаный нагрудник нордийского воина", 20, 0);
        Sword oldNordicSword = new Sword(4,
                "Ржавый нордийский меч из катакомб",
                1.8, "Ржавый нордийский меч", 20, 0);
        Shield oldNordicShield = new Shield(5,
                "Ржавый нордийский меч из катакомб",
                1.8, "Ржавый нордийский меч", 10, 5);

        ActiveSlot<Potion> activeSlot1= new ActiveSlot<>(healPotion);
    }
}
