package OOP_sem7.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MiddleDev implements Observer{
    private static Random random = new Random();
    private String name;
    private double minSalary;
    private boolean needJob;
    private List<VacancyType> expectedTypes = new ArrayList<>();
    {
        expectedTypes.add(VacancyType.BackEndDev);
        expectedTypes.add(VacancyType.FrontEndDev);
    }
    public MiddleDev(String name) {
        this.name = name;
        this.minSalary = random.nextDouble(65000,95000);
        this.needJob=true;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        for (VacancyType expectedType : expectedTypes) {
            if (expectedType == vacancy.getType() && minSalary <= vacancy.getSalary()) {
                System.out.printf("MiddleDev %s (%.2f) needs %s-%s job - %.2f\n", name, minSalary, vacancy.getBuilder().getName(),vacancy.getType().toString(), vacancy.getSalary());
                minSalary = vacancy.getSalary();
                needJob = false;
                return;
            }
        }
        System.out.printf("MiddleDev %s (%.2f) seeks better job than %s-%s- %.2f\n", name, minSalary, vacancy.getBuilder().getName(),vacancy.getType().toString(),vacancy.getSalary());
    }
    @Override
    public boolean getNeedJob() {
        return needJob;
    }
}
