public class Cat extends Animal{

    Cat(String name, String color, int age, double limitForRun, double limitForJump) {
        super(name, color, age);
        this.limitForRun = limitForRun;
        this.limitForJump = limitForJump;
    }

    @Override
    boolean swim(double a){
        return false;
    }
}
