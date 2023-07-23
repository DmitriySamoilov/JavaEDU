package Java_test_toyshop;

public class Toy {
    static int id;
    private String toy_id;
    private String name;
    private int frequency = 1; //категория по вероятности 1-20%, 2-20%, 3-60% выбора для приза
    private int volume = 1; //количество игрушек

    public Toy(String name, int frequency, int volume) {
        this.toy_id = ((Object) (++id)).toString();
        this.name = name;
        this.frequency = frequency;
        this.volume = volume;
    }

    public Toy(Toy toy) { // создает копию toy c volume 1
        this.toy_id = toy.getToy_id();
        this.name = toy.getName();
        this.frequency = toy.getFrequency();
        this.volume = 1;
    }

    public String getToy_id() {
        return toy_id;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {//изменить категорию (частоту выпадения)
        this.frequency = frequency;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return name +
                "/id" + toy_id +
                "/frequency:" + frequency +
                "/volume:" + volume;

    }
}
