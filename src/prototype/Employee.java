package prototype;

public class Employee {
    private Name name;
    private String job;
    private int age;

    Employee(Name name, String job, int age){
        this.name = name;
        this.job = job;
        this.age = age;
    }

    static Employee newInstance(Employee employee){
        return new Employee(Name.newInstance(employee.name), employee.job, employee.age);
    }

    public void setJob(String newJob){
        job = newJob;
    }

    public String getJob() {
        return job;
    }
}
