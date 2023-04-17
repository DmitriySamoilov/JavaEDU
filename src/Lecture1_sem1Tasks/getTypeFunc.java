package Lecture1_sem1Tasks;

public class getTypeFunc {
    public static void main(String[] args) {


        //System.out.println(getType(a)); // Integer
        //System.out.println(getType(d)); // Double
    }
    public static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}