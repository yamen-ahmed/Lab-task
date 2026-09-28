class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double highsalary(Employee e) {
        if (this.salary > e.salary) {
            return this.salary;
        } else {
            return e.salary;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Nasaar", 5);
        Employee e2 = new Employee("Pessi", 3);

        System.out.println("High salary between both of them are : " + e1.highsalary(e2));
    }
}
