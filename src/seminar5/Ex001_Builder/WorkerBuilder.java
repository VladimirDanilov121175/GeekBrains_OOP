package seminar5.Ex001_Builder;

public class WorkerBuilder {
    public static WorkerBuilder builder;
    private Worker worker;

    public static WorkerBuilder getBuilder() {
        if (builder == null) {
            builder = new WorkerBuilder();
        }
        builder.worker = new Worker();
        return builder;
    }

    public Worker build() {
        return worker;
    }

    public WorkerBuilder setName(String name) {
        worker.setName(name);
        return this;
    }

    public WorkerBuilder setSalary(int salary) {
        worker.setSalary(salary);
        return this;
    }

    public WorkerBuilder setAge(int age) {
        worker.setAge(age);
        return this;
    }

    public WorkerBuilder setDepartment(String department) {
        worker.setDepartment(department);
        return this;
    }

    public WorkerBuilder setSpecialization(String specialization) {
        worker.setSpecialization(specialization);
        return this;
    }

    public WorkerBuilder setSex(String sex) {
        worker.setSex(sex);
        return this;
    }

    public WorkerBuilder setOnVacation(boolean onVacation) {
        worker.setOnVacation(onVacation);
        return this;
    }
}
