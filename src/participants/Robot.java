package participants;

public class Robot implements Swimable, Competitor{
    private String model;
    private String name;

    private int maxRunDistance;
    private int maxJumpHeight;
    private int maxSwimDistance;
    boolean onDistance;

    public Robot(String model, String name, int maxRunDistance, int maxJumpHeight){
        this.model = model;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
        maxSwimDistance = TYPICAL_SWIM_DISTANCE * 30;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void showResult() {
        System.out.println("Robot " + model + " " + name + ": " + onDistance);
    }

    public void setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Robot " + model + " " + name + " - Run OK");
        } else {
            System.out.println("Robot " + model + " " + name + " - Run FAILED");
            onDistance = false;
        }
    }

    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println("Robot " + model + " " + name + " - Jump OK");
        } else {
            System.out.println("Robot " + model + " " + name + " - Jump FAILED");
            onDistance = false;
        }
    }

    public void info() {
        System.out.println("Robot " + model + " " + name + ": " + onDistance);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Robot " + model + " " + name + " - Swim OK");
    }
}
