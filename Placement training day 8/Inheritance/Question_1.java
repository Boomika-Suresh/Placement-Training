/*Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 
'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to 
an employee and a manager by making an object of both of these classes and print the same. */

package _Inheritance_;
public class Question_1 {
    public static void main(String args[]){
    /* Member mem1 = new Member("Boomika",20,"9988776655","Anna nagar",54000);
    mem1.printSalary(); */
    System.out.println();

    Employee emp1 = new Employee("Joshua",28,"7878896756","KK Nagar",80000,"Consultant");
    System.out.println("Employee Name :"+emp1.Name);
    System.out.println("Age :"+emp1.Age);
    System.out.println("Phone Number :"+emp1.PhoneNumber);
    System.out.println("Address :"+emp1.Address);
    emp1.printSalary();
    System.out.println("Specialization :"+emp1.Specialization);
    System.out.println();

    Manager man1 = new Manager("Jane",29,"8999777565","Pudur",67000,"Tester","Coding");
    System.out.println("Manager Name :"+man1.Name);
    System.out.println("Age :"+man1.Age);
    System.out.println("Phone Number :"+man1.PhoneNumber);
    System.out.println("Address :"+man1.Address);
    man1.printSalary();
    //System.out.println("Specialization :"+man1.Specialization);
    System.out.println("Department: "+man1.Department);
    }
    
}

class Member{
    String Name;
    int Age;
    String PhoneNumber;
    String Address;
    double Salary;

    Member(String Name,int Age,String PhoneNumber,String Address,double Salary)
    {
        this.Name = Name;
        this.Age = Age;
        this.PhoneNumber = PhoneNumber;
        this.Address = Address;
        this.Salary = Salary;
    }

    void printSalary()
    {
        //System.out.println("Member: "+Name);
        System.out.println("Salary: "+Salary);
    }

}

class Employee extends Member{

    String Specialization;

    Employee(String Name, int Age, String PhoneNumber, String Address, double Salary,String Specialization) {
        super(Name, Age, PhoneNumber, Address, Salary);
        this.Specialization = Specialization;
        
    }
    
}

class Manager extends Employee{

    String Department;
    Manager(String Name, int Age, String PhoneNumber, String Address, double Salary, String Specialization,String Department) {
        super(Name, Age, PhoneNumber, Address, Salary, Specialization);
        this.Department = Department;
    }
    
}

/*
 OUTPUT:
    Employee Name :Joshua
    Age :28
    Phone Number :7878896756
    Address :KK Nagar
    Salary: 80000.0
    Specialization :Consultant

    Manager Name :Jane
    Age :29
    Phone Number :8999777565
    Address :Pudur
    Salary: 67000.0
    Department: Coding 
 */