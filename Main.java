public class Main{
    public static void main(String[] args){
        
        Student [] students = new Student[5];
        
        
        Student james = new Student();
        System.out.println(james);
    }

    static class Student{
        int [] grade = new int [5];
        String [] name = new String [5];
        float [] gpa = new float [5];

    }
}