package HomeTasks4;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
Постараться не обращаться к листу по индексам*/
public class Task1 {
    public static void main(String[] args) {

        LinkedList<Integer> lst =  createList(11,0,10);
        System.out.println(lst);
        lst = reverse_LinkedList(lst);
        System.out.println(lst);
    }
    static LinkedList<Integer> reverse_LinkedList(LinkedList<Integer> lst){
        LinkedList<Integer> lst2 = new LinkedList<>();
        ListIterator <Integer> iterator = lst.listIterator(lst.size()) ;
        while (iterator.hasPrevious()){
            lst2.add(iterator.previous());
        }
            return lst2;
    }
    public static LinkedList<Integer> createList(int capacity, int min, int max){
        LinkedList<Integer> lst = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < capacity; i++) {
            lst.add(rnd.nextInt(min, max));
        }
        return lst;
    }
}
