package Lecture1_sem1Tasks;

public class prt2DArr {
    public static void main(String[] args) {
        //int[] arr[] = new int[3][5];
        int[] arr[] =new int [] []{
                {4,5,6,6,6},
                {7,8,9,9,9},
                {1,2,3,3,3}
        };

        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
    }
}
