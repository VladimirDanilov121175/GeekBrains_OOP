package seminar5.Ex001_Builder;

public class Main {
    public static void main(String[] args) {

        Worker worker1 = WorkerBuilder.getBuilder().setName("Worker1").setAge(23).setSex("male").build();
        System.out.println(worker1);

        Worker worker2 = WorkerBuilder.getBuilder().setName("Worker2").setAge(45).setSex("male").
        setOnVacation(true).build();
        System.out.println(worker2);
    }
}
