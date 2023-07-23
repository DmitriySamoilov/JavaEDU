package Java_test_toyshop;

import java.util.*;

public class Shop {
    private String name;
    private HashMap<Integer, List<Toy>> toys_store = new HashMap<>();//склад магазина
    private List<Toy> prize_fund = new ArrayList<>();//призовой фонд

    public String getName() {
        return name;
    }

    public HashMap<Integer, List<Toy>> getToys_store() {
        return toys_store;
    }

    public List<Toy> getPrize_fund() {
        return prize_fund;
    }

    public Shop(String name) {
        this.name = name;
    }

    public void addToy(Toy toy) {
        if (toys_store.containsKey(toy.getFrequency())) {
            toys_store.get(toy.getFrequency()).add(toy);
        } else {
            List<Toy> toys = new ArrayList<>();
            toys.add(toy);
            toys_store.put(toy.getFrequency(), toys);
        }
    }

    public void getToyToPrizeFund() {
        Random rnd = new Random();
        Boolean flag = true;
        int odd1 = 0;
        int frequency = 3;//60%
        while (flag) {
            odd1 = rnd.nextInt(1, 100);//выбрали категорию frequency для toy 1,2,3
            if (odd1 <= 20) {
                frequency = 1;//20%
            } else if (odd1 <= 40) {
                frequency = 2;//20%
            }

            if (toys_store.get(frequency).size() != 0) flag = false; //проверяем в этой категории на складе наличие toys
        }
        int odd2 = rnd.nextInt(0, toys_store.get(frequency).size());
        Toy prize_toy = toys_store.get(frequency).get(odd2);// выбрали toy из наличия внутри категории на складе toys_store
        prize_toy.setVolume(prize_toy.getVolume() - 1);//уменьшаем количество toy в toys_store на 1
        prize_fund.add(new Toy(prize_toy));//  содаем такой же toy  в призовом фонде
        if (prize_toy.getVolume() == 0) {toys_store.get(frequency).remove(odd2);} // удаляем toy со склада toys_store
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", toys_store=" + toys_store +
                ", prize_fund=" + prize_fund +
                '}';
    }
}
