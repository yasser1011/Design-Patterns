package prototype;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(new Name("emp1First", "emp1Last"), "tester", 20);
        Employee empCloned = Employee.newInstance(emp1);

        empCloned.setJob("not tester");

        System.out.println(emp1.getJob());
        System.out.println(empCloned.getJob());
    }
}
