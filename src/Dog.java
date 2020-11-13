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
        if(a > limitForRun){
            return false;
        }
        return true;
    }

    @Override
    boolean swim(double a){
        if(a > limitForSwim){
            return false;
        }
        return true;
    }

    @Override
    boolean jump(double a){
        if(a > limitForJump){
            return false;
        }
        return true;
    }
}
