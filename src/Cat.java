public class Cat extends Animal{

    double limitForRun;
    double limitForJump;

    Cat(String name, String color, int age, double limitForRun, double limitForJump) {
        super(name, color, age);
        this.limitForRun = limitForRun;
        this.limitForJump = limitForJump;
    }

    @Override
    boolean run(double a){
        if(a > limitForRun){
            return false;
        }
        return true;
    }

    @Override
    boolean swim(double a){
        return false;
    }

    @Override
    boolean jump(double a){
        if(a > limitForJump){
            return false;
        }
        return true;
    }
}
