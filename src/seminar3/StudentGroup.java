package seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterator<Student> {
    private List<Student> students;

    private int id;
    private String teacher;

    public StudentGroup(int id, String teacher) {
        this.students = new ArrayList<Student>();
        this.id = id;
        this.teacher = teacher;
    }

    /**
     * Method for adding a new student to the group
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String lastName) {
//        students.removeIf(student -> student.getLastName().equals(lastName));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getLastName().equals(lastName)){
                iterator.remove();
            }
        }
    }

    // region getters and setters
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    // endregion getters and setters

    private int index;

    @Override
    public boolean hasNext() {
        return index < students.size();
    }

    @Override
    public Student next() {
        return this.getStudents().get(index++);
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
