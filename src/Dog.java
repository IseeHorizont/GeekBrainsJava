public class Dog extends Animal{

    double limitForRun;
    double limitForSwim;
    double limitForJump;

    Dog(String name, String color, int age, double limitForRun, double limitForSwim, double limitForJump) {
        super(name, color, age);
        this.limitForRun = limitForRun;
        this.limitForSwim = limitForSwim;
        this.limitForJump = limitForJump;
    }

    @Override
    boolean run(double a){
        return a < limitForRun;
    }

    @Override
    boolean swim(double a){
        return a < limitForSwim;
    }

    @Override
    boolean jump(double a){
        return a < limitForJump;
    }
}
