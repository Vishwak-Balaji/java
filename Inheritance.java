public class Inheritance {
    public static void main(String[] args) {

        Manager manager = new Manager("Rahul", 35, 101, "IT");

        manager.displayInfo();      // from Person
        System.out.println("Employee ID: " + manager.employeeId);

        manager.work();             // overridden method
        manager.conductMeeting();   // manager specific method
    }
}
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int employeeId;

    Employee(String name, int age, int employeeId) {
        super(name, age); // calling parent constructor
        this.employeeId = employeeId;
    }

    void work() {
        System.out.println(name + " is working as an employee.");
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int age, int employeeId, String department) {
        super(name, age, employeeId);
        this.department = department;
    }

    @Override
    void work() {
        System.out.println(name + " is managing the " + department + " department.");
    }

    void conductMeeting() {
        System.out.println(name + " is conducting a meeting.");
    }
}
