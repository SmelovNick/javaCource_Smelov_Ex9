import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Potion healPotion = new Potion(1, "Зелье, восстанавливающие ОЗ", 0.4, "Зелье здоровья");

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

        System.out.println("Создание экземпляра класса Potion и его методы");
        ActiveSlot<Potion> activeSlotOne = new ActiveSlot<>(healPotion);
        activeSlotOne.getItem().equip();
        activeSlotOne.getItem().consumeItem();
        System.out.println(activeSlotOne.getItem().toString());
        try {
            System.out.println("Клонирование экземпляра класса Potion и проверка");
            Potion secondHPPotion = healPotion.clone();
            ActiveSlot<Potion> activeSlotTwo = new ActiveSlot<>(secondHPPotion);
            activeSlotOne.getItem().setName("manaPotion");
            System.out.println(activeSlotOne.getItem().toString());
            System.out.println(activeSlotTwo.getItem().toString());
        } catch (CloneNotSupportedException ex) {
            System.out.println("Не удалось клонировать экземпляр класса Potion");
        }

        System.out.println("Создание предметов инвентаря");

        EquipmentSlot<Sword> equippedSword = new EquipmentSlot<>(oldNordicSword);
        EquipmentSlot<Shield> equippedShield = new EquipmentSlot<>(oldNordicShield);
        EquipmentSlot<Helmet> equippedHelmet = new EquipmentSlot<>(leatherHelmet);
        EquipmentSlot<Chest> equippedChest = new EquipmentSlot<>(leatherChest);

        System.out.println(equippedSword.getItem().toString());
        System.out.println(equippedShield.getItem().toString());
        System.out.println(equippedHelmet.getItem().toString());
        System.out.println(equippedChest.getItem().toString());

        equippedSword.getItem().equip();
        equippedShield.getItem().equip();
        equippedHelmet.getItem().equip();
        equippedChest.getItem().equip();

        try {
            System.out.println("Клонирование экземпляра класса Sword и проверка");
            Sword nordicSword = oldNordicSword.clone();
            EquipmentSlot<Sword> newNordicSword = new EquipmentSlot<>(nordicSword);
            newNordicSword.getItem().setName("newNordicSword");
            System.out.println(equippedSword.getItem().toString());
            System.out.println(newNordicSword.getItem().toString());
        } catch (CloneNotSupportedException ex) {
            System.out.println("Не удалось клонировать экземпляр класса Sword");
        }

    }
}
