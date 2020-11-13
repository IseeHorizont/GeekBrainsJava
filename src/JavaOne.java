public class JavaOne {

    public static void main(String[] args) {
        Cat firstCat = new Cat("Мурзик", "Рыжий", 3, 300, 2.1);
        Cat secondCat = new Cat("Пушок", "Белый", 4, 190, 1.9);
        Dog firstDog = new Dog("Дружок", "Черно-белый", 2,
                                550, 1.1, 1);
        Dog secondDog = new Dog("Тузик", "Черный", 6,
                                240, 0.4, 6);

        System.out.println("---------CAT's actions------------");
        System.out.println(firstCat.name + " run: " + firstCat.run(100));
        System.out.println(secondCat.name + " run: " + secondCat.run(200.5));
        System.out.println(firstCat.name + " jump: " + firstCat.jump(20));
        System.out.println(firstCat.name + " jump: " + firstCat.jump(1.5));
        System.out.println(firstCat.name + " swim: " + firstCat.swim(100));
        System.out.println(secondCat.name + " swim: " + secondCat.swim(10));

        System.out.println("---------DOG's actions------------");
        System.out.println(firstDog.name + " run: " + firstDog.run(480));
        System.out.println(secondDog.name + " run: " + secondDog.run(505.5));
        System.out.println(firstDog.name + " jump: " + firstDog.jump(0.2));
        System.out.println(secondDog.name + " jump: " + secondDog.jump(7));
        System.out.println(firstDog.name + " swim: " + firstDog.swim(9));
        System.out.println(secondDog.name + " swim: " + secondDog.swim(0.3));
    }

}
