public class Animal {
    String name;
    String color;
    int age;
    double limitForRun;
    double limitForSwim;
    double limitForJump;

    Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    boolean run(double a){
        return a < limitForRun;
    }

    boolean swim(double a){
        return a < limitForSwim;
    }

    boolean jump(double a){
        return a < limitForJump;
    }
}
