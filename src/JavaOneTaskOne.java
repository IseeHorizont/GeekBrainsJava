import java.util.Random;
import java.util.Scanner;

public class JavaOneTaskOne {
    public static void main(String[] args) {
        guessRandomNumberSince1Until9();

        guessRandomWords();
    }

    public static void guessRandomNumberSince1Until9(){
        Scanner scan = new Scanner(System.in);
        int randomNum = (int)(Math.random() * (9 - 1));

        System.out.println("Угадайте число от 1 до 9. У Вас 3 попытки.");

        while(true) {
            for (int i = 1; i <= 3; i++) {
                int inputNumb = scan.nextInt();
                if (inputNumb == randomNum) {
                    System.out.println("Победа! Вы угадали число!");
                    return;
                } else {
                    System.out.println("Вы не угадали число.");
                    if (inputNumb > randomNum) {
                        System.out.println("Подсказка: \"Введённое число больше загаданного\"");
                    } else {
                        System.out.println("Подсказка: \"Введённое число меньше загаданного\"");
                    }
                    System.out.println("Осталось попыток: " + (3 - i));
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            int inputAnswer = scan.nextInt();
            if(inputAnswer == 0){
                System.out.println("Good luck! See you next game...");
                break;
            }else{
                System.out.println("Снова угадайте число от 1 до 9. У Вас по-прежнему 3 попытки.");
            }
        }
    }

    public static void guessRandomWords(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        String randomWord = words[random.nextInt(26)-1];
        System.out.println("Угадайте англо-язычное слово, обозначающее одно из культурных растений");

        while(true) {
            String inputWord = scan.nextLine();
            String outWord = "";
            if(randomWord.equals(inputWord)){
                System.out.println("Вы угадали слово!");
                break;
            }

            for (int i = 0; i < randomWord.length(); i++) {
                if (randomWord.charAt(i) == inputWord.charAt(i)) {
                    outWord += randomWord.charAt(i);
                } else {
                    outWord += "#";
                }
            }
            for (int i = 0; i < (15 - inputWord.length()); i++) {
                outWord += "#";
            }
            System.out.println("Подсказка: " + outWord);
            System.out.println("Попробуйте угадать ещё раз:");
        }
    }
}
