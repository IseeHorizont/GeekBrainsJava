package participants;

public class Cat extends Animal {
    public Cat(String name, Color color) {
        super("Cat", name, color,500, 100);
    }

    @Override
    public void swim(int distance) {
        System.out.println(color.getEnglishColorName() + " " + type + " " + name + " не хочет плавать!");
    }
}
