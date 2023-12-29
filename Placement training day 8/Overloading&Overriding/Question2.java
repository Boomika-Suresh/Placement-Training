/* Create a class hierarchy representing different types of employees in a company. Design a base class 
Employee with fields for the employee's name, employee ID, and a method 
named calculateSalary() that returns the basic salary. Implement two subclasses: Manager and Developer.
Manager class should have an additional field for the bonus percentage. 
Developer class should have an additional field for the programming language.
Override the calculateSalary() method in both the Manager and Developer classes 
to include the bonus for managers and an extra allowance for developers. The basic salary for all employees is $50,000.
Write a program to create instances of managers and developers, call the calculateSalary method on each, and print the details.*/

package Overloading_Overriding;
public class Question2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Boomika",12);
        double salary = emp1.calculateSalary();
        System.out.println("===============================================");
        System.out.println("EMPLOYEE");
        System.out.println("===============================================");

        System.out.println("Employee ID: "+emp1.Employee_id);
        System.out.println("Employee Name: "+emp1.Employee_name);
        System.out.println("Employee Salary: $"+salary);

        System.out.println("===============================================");
        System.out.println("MANAGER");
        System.out.println("===============================================");
        Manager man1 = new Manager("Dino",23,50);
        double salary1 = man1.calculateSalary();
        System.out.println("Manager ID: "+man1.Employee_id);
        System.out.println("Manager Name: "+man1.Employee_name);
        System.out.println("Manager Salary: $"+salary1);

        System.out.println("===============================================");
        System.out.println("DEVELOPER");
        System.out.println("===============================================");
        Developer dev1= new Developer("Caesar",34,"Python");
        double salary2 = dev1.calculateSalary();
        System.out.println("Developer ID: "+dev1.Employee_id);
        System.out.println("Developer Name: "+dev1.Employee_name);
        System.out.println("Developer Salary: $"+salary2);
         System.out.println("===============================================");

    }
}
class Employee{
    String Employee_name;
    int Employee_id;
    double basic_salary=50000;
    Employee(String emp_name,int emp_id)
    {
        this.Employee_name = emp_name;
        this.Employee_id = emp_id;
    }
    double calculateSalary()
    {
        return basic_salary;
    }
    void printDetails()
    {
        System.out.println("Employee ID: "+Employee_id);
        System.out.println("Employee name: "+Employee_name);
        System.out.println("Salary: "+basic_salary);
    }

}
class Manager extends Employee{
    double basic_salary=50000;
    double bonus_percentage;
    double bonus;
    Manager(String emp_name,int emp_id,double bonus)
    {
        super(emp_name,emp_id);
        this.bonus_percentage = bonus;
        
    }
    @Override
    double calculateSalary()
    {
        bonus = (bonus_percentage/100)*basic_salary;
        basic_salary +=bonus;
        return basic_salary;
    }

}
class Developer extends Employee{
    double basic_salary=50000;
    double allowance=5000;
    String language;
    Developer(String emp_name,int emp_id,String language)
    {
        super(emp_name,emp_id);
        this.language = language;
        
    }
    @Override
    double calculateSalary()
    {
        basic_salary +=allowance;
        return basic_salary;
    }

}

/*
 OUTPUT:
    ===============================================
    EMPLOYEE
    ===============================================
    Employee ID: 12
    Employee Name: Boomika
    Employee Salary: $50000.0
    ===============================================
    MANAGER
    ===============================================
    Manager ID: 23
    Manager Name: Dino
    Manager Salary: $75000.0
    ===============================================
    DEVELOPER
    ===============================================
    Developer ID: 34
    Developer Name: Caesar
    Developer Salary: $55000.0
    =============================================== 
 */