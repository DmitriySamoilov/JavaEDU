package OOP_sem2;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;//Сытость
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= this.appetite) {
            this.satiety = true;
            plate.setFood(plate.getFood() - this.appetite);
        }
    }
}
