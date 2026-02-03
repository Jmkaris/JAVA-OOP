public class Main{
    public static void main(String[] args){
        
        // Student [] students = new Student[5];
        Student james = new Student();

        james.greeting();

        // System.out.println(james.grade);
        // System.out.println(james.name);
        // System.out.println(james.gpa);
    }

    static class Student{
        int grade;
        String name;
        float gpa;

        Student(){
            this.name = "James Kariuki";
            this.gpa = 3.5f;
            this.grade = 56;
        }

        void greeting(){
            System.out.println("My name is " + name);
        }
       
    }
}