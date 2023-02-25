package seminar3;

/*
 Реализовать приложение, позволяющее:
 1. Добавлять, удалять и выводить печать студентов;
 2. Выводить студентов со средним баллом выше 3.96;
 3. Реализовать всю логику итерирования и компарации;
 */

import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StudentGroup group1 = new StudentGroup(237, "Ivanov I.I.");

        group1.addStudent(new Student("Vladimir", "Danilov", 4.95));

        // region Create random students
        Random r = new Random();
        for (int i = 1; i < 10; i++) {
            group1.addStudent(new Student("FirstName" + i, "LastName" + i,
                    Math.round(r.nextDouble(3, 5) * 100.0) / 100.0));
        }
        // endregion

        System.out.println(group1.getStudents());

        // Удаление студента
        group1.removeStudent("Danilov");
        System.out.println(group1.getStudents());


        // Вывод студентов с оценкой выше 3.96
        Iterator<Student> students = group1;
        while (students.hasNext()) {
            Student student = students.next();
            if (student.getAverageMark() > 3.96)
                System.out.print(student);
        }

        System.out.println("\n--------------------------------");

        // Сортировка студентов по успеваемости
        group1.getStudents().sort(new StudentComparator());
        System.out.println(group1.getStudents());


    }
}
