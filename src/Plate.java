import java.util.Random;

public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }

    public int getFood(){
        return food;
    }

    // Считаем, что если коту мало еды в тарелке, то он ее просто не трогает,
    // то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
    public void decreaseFood(int catAppetite){
        if(catAppetite <= food){
            food -= catAppetite;
        }
    }

    public void addFood(){
        Random random = new Random();
        int meal = random.nextInt(20);
        food += meal;
        System.out.println("В тарелку добавили " + meal + " еды");
    }

    public void info(){
        System.out.println("В тарелке осталось единиц еды: " + food);
    }
}
