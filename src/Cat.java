public class Cat{
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate){
        if(plate.getFood() > 0){
            satiety = true;
            plate.decreaseFood(appetite);
        }
    }

    public void isSatiety(){
        System.out.println("Сытость кошки по кличке " + name + ": " + satiety);
    }
}
