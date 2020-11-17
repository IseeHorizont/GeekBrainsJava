public class JavaOne {
    /**
     1. Расширить задачу про котов и тарелки с едой
     2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
     (например, в миске 10 еды, а кот пытается покушать 15-20)
     3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
     Если коту удалось покушать (хватило еды), сытость = true
     4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает,
     то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
     5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
     и потом вывести информацию о сытости котов в консоль
     6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
     */

    public static void main(String[] args) {
        Plate plate = new Plate(50);
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Мурзик", 20);
        cats[1] = new Cat("Пушок", 6);
        cats[2] = new Cat("Васька", 10);
        cats[3] = new Cat("Маруся", 14);
        cats[4] = new Cat("Матроскин", 8);

        plate.info();
        for(int i = 0; i < cats.length; i++){
            cats[i].eat(plate);
            cats[i].isSatiety();
            plate.info();
            if(plate.getFood() == 0){
                plate.addFood();
            }
        }
        System.out.println("Все кошки сыты!");
    }
}
