package Java_test_toyshop;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop("Лобаз");

        for (int i = 0; i < 100; i++) { //100 toys создала toy_factory  и добавили в shop
            shop.addToy(toy_factory());
        }

        for (int i = 0; i < 20; i++) {//20 toys отправили в prize_fund
            shop.getToyToPrizeFund();
        }

        Json_service.saveJson(shop.getPrize_fund());//сохранили prize_fund в файл .json

        System.out.println(shop);
    }

    public static Toy toy_factory() {
        Random rnd = new Random();
        String[] toy_names = {"Мишка","Зайка", "Жирафа", "Слон", "Дельфин", "Кит", "Морж", "Колобок"};
        String[] toy_additional_names = {"Меховой", "Белый", "Горбатый", "Голубой", "Гризли", "Африканский","Амазонский", "Антарктический","Ушастый"};
        String[] toy_sizes = {"Giant","Big", "Medium", "Small", "Tiny"};
        String toy_name = toy_additional_names[rnd.nextInt(0, toy_additional_names.length)] + " "
                + toy_names[rnd.nextInt(0, toy_names.length)] + " "
                + toy_sizes[rnd.nextInt(0,toy_sizes.length)];
        return new Toy(toy_name, rnd.nextInt(1, 4), 1);
    }
}
