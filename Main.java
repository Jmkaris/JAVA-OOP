public class Main{
    public static void main(String[] args){
        
        Student [] students = new Student[5];
        
        
        Student james = new Student();

        james.name = "James Kariuki";
        james.gpa = 3.5f;
        james.grade = 56;

        System.out.println(james.grade);
        System.out.println(james.name);
        System.out.println(james.gpa);
    }

    static class Student{
        int grade;
        String name;
        float gpa;

    }
}