// 1️⃣ Student Management System

// Concepts: Class, objects, instance variables, methods
// Create a Student class with:

// Attributes: name, rollNo, marks

// Methods:

// displayDetails()

// calculateGrade()

// 👉 Create multiple student objects in main().
public class Students {

    public static void main(String[] args) {

        // Create object
        Student student1 = new Student("James Karis", 45, 6.7);

        // Call method
        student1.displayInfo();
    }
}

// Separate Student class
class Student {

    String name;
    int age;
    double gpa;

    // Constructor
    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
}
