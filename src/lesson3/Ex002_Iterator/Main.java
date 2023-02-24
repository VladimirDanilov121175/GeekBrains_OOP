package lesson3.Ex002_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // region Intro Iterator
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(12345);

        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() * 10);
        }
        // endregion

        // region Iterator for class fields
        Worker worker = new Worker("FirstName", "LastName", 23, 34000);

//        Iterator<String> fieldsIterator = worker;
//        while (fieldsIterator.hasNext()) {
//            System.out.println(fieldsIterator.next());
//        }

        while (worker.hasNext()) {
            System.out.println(worker.next());
        }

        // endregion
    }
}
