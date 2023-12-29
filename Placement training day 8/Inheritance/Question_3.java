import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }
}

class Professor extends Person {
    private int employeeId;

    public Professor(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

class Course {
    private String courseName;
    private List<Course> prerequisites;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.prerequisites = new ArrayList<>();
        this.enrolledStudents = new ArrayList<>();
    }

    public void addPrerequisite(Course prerequisite) {
        prerequisites.add(prerequisite);
    }

    public void enrollStudent(Student student) {
        if (hasCompletedPrerequisites(student)) {
            enrolledStudents.add(student);
            System.out.println("Enrolled " + student.getName() + " in " + courseName);
        } else {
            System.out.println(student.getName() + " cannot be enrolled in " + courseName +
                    " due to incomplete prerequisites.");
        }
    }

    private boolean hasCompletedPrerequisites(Student student) {
        for (Course prerequisite : prerequisites) {
            boolean hasCompleted = false;
            for (Student enrolledStudent : prerequisite.enrolledStudents) {
                if (enrolledStudent.getStudentId() == student.getStudentId()) {
                    hasCompleted = true;
                    break;
                }
            }
            if (!hasCompleted) {
                return false;
            }
        }
        return true;
    }

    public void displayEnrolledStudents() {
        System.out.println("Enrolled students in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("Student Name: " + student.getName() +
                    ", Student ID: " + student.getStudentId());
        }
    }
}

public class UniversityEnrollmentSystem {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 20, 101);
        Student student2 = new Student("Jane Smith", 22, 102);
        Student student3 = new Student("Bob Johnson", 21, 103);

        Course math101 = new Course("Math 101");
        Course physics101 = new Course("Physics 101");
        Course calculus = new Course("Calculus");

        // Set prerequisites for courses
        math101.addPrerequisite(calculus);
        physics101.addPrerequisite(calculus);

        // Enroll students in courses
        math101.enrollStudent(student1);
        math101.enrollStudent(student2);

        physics101.enrollStudent(student1);
        physics101.enrollStudent(student3);

        calculus.enrollStudent(student2);
        calculus.enrollStudent(student3);

        // Display enrolled students
        math101.displayEnrolledStudents();
        physics101.displayEnrolledStudents();
        calculus.displayEnrolledStudents();
    }
}
