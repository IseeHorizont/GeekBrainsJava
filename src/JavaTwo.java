import java.util.HashSet;
import java.util.Set;

public class JavaTwo {

    public static void main(String[] args){

        //task 1

        String[] words = {
                "Ocean", "Sea", "Apple", "Second", "Giraffe", "Cow", "Dog", "Cat", "Horse", "Sword",
                "Steal", "Sound", "Grape", "Apple", "Sea", "Summer", "Monday", "Sunday", "House", "House",
        };
        Set<String> listOfWords = new HashSet<>(words.length);
        for (int i = 0; i < words.length; i++){
            listOfWords.add(words[i]);
        }
        int count = 1;
        System.out.println("Массив уникальных слов:");
        for (String item : listOfWords) {
            System.out.println(count + ") " + item);
            count++;
        }

        //task 2

        ListOfPhoneNumbers list = new ListOfPhoneNumbers();
        list.add("Иванов", "8-969-444-0000");
        list.add("Иванов", "8-969-444-1111");
        list.add("Сергеев", "4-555-444-9876");
        list.add("Петров", "2-000-444-1234");
        list.print();

        list.get("Иванов");
    }


}