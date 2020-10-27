public class JavaOneTaskOne {
    public static void main(String[] args) {
        byte b = 127;
        short sh = 1342;
        int in = -25253;
        long lon = 543733754;
        char ch = 'a';
        float fl = -2.7f;
        double doub = 2.5656;
        boolean wh = false;

        thirdTask(8.8f, 1.7f,-2.7f,-1.6f);
        System.out.println(fourthTask(5, 8));
        System.out.println(fifthTask(15));
        System.out.println(sixthTask(-43));
        seventhTask("Володя");
        eighthTask(2005);

    }

    public static void thirdTask(float a, float b, float c, float d){
        System.out.println(a * (b + (c / d)));
    }

    public static boolean fourthTask(int a, int b){
        return (a + b >= 10 && a + b <= 20) ? true : false;
    }

    public static String fifthTask(int a){
        return (a >= 0) ? "Положительное число" : "Отрицательное число";
    }

    public static boolean sixthTask(int a){
        return (a >= 0) ? false : true;
    }

    public static void seventhTask(String name){
        System.out.println("Привет, " + name);
    }

    public static void eighthTask(int year){
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " год - високосный");
        }else{
            System.out.println(year + " год - невисокосный");
        }
    }

}
