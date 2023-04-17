package Lecture1_sem1Tasks;

public class sw_case_example {
    public static void main(String[] args) {
        int mounth = 2;
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
            case 2:
                text ="Too late";
                break;

            default:
                text = "mistake";
                break;
        }
        System.out.println(text);

    }
}
