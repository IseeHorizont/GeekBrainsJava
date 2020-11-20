public class Dog extends Animal{

    Dog(String name, String color, int age, double limitForRun, double limitForSwim, double limitForJump) {
        super(name, color, age);
        this.limitForRun = limitForRun;
        this.limitForSwim = limitForSwim;
        this.limitForJump = limitForJump;
    }
}
