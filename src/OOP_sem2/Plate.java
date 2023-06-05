package OOP_sem2;

public class Plate {
    private int food;

    public Plate(int food) {
        if (food > 0) {
            this.food = food;
        } else {
            this.food = 0;
        }
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food > 0) {
            this.food = food;
        } else {
            this.food = 0;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(int food) {
        setFood(this.food + food);
    }
}