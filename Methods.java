// It is a block of code that is executed when called upon
public class Methods {
    public static void main(String[] args){
        
        String name;
        int age; 
        name = "Karis";
        age = 22;


        hello(name, age);
    }

    static void hello(String name, int age){
        System.out.println("hello " + name + " and I am " + age + "years old");
    }
}

