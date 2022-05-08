package Task1;

class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[]{
                new WaterPistol(),
                new Rogatca(),
                new Pistol(),
                new Avtomat(),
                new RPG()

                // TODO заполнить слоты оружием
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO если значение slot больше значения последнего элемента массива, то
        // выйти из метода написав об этом в консоль
        if (slot > getSlotsCount()) {
            try {
                throw new WeaponNotFound();
            } catch (WeaponNotFound e) {
                System.out.println("У вас нету такого оружия");
            }
        } else {
            // Получаем оружие из выбранного слота
            Weapon weapon = weaponSlots[slot];
            // Огонь!
            weapon.shot();
        }
    }
}