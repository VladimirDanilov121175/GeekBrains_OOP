package lesson3.Ex004_Comparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        return Integer.compare(o1.salary, o2.salary);
    }
}
