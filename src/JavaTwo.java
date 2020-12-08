
public class JavaTwo {
    public static final int size = 10000000;
    public static final int h = size / 2;

    public static void simpleMethodMakeArrayAndCalculatingInIt(){

        float[] arr = new float[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время выполнения операций вычисления в массиве в одном потоке: "
                                                + (System.currentTimeMillis() - startTime));
    }

    public static void multiThreadsMethodMakeArrayAndCalculatingInIt(){
        float[] arr = new float[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        long time = System.currentTimeMillis();

        Thread leftHalf = new Thread(new Runnable() {
            @Override
            public void run() {
                float[] leftSide = new float[h];
                System.arraycopy(arr, 0, leftSide, 0, h);
                for (int i = 0; i < leftSide.length; i++) {
                    leftSide[i] = (float)(leftSide[i] * Math.sin(0.2f + i / 5)
                                    * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.arraycopy(leftSide, 0, arr, 0, h);
            }
        });

        Thread rightHalf = new Thread(new Runnable() {
            @Override
            public void run() {
                float[] rightSide = new float[h];
                System.arraycopy(arr, h, rightSide, 0, h);
                for (int i = 0; i < rightSide.length; i++) {
                    rightSide[i] = (float)(rightSide[i] * Math.sin(0.2f + i / 5)
                                    * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.arraycopy(rightSide, 0, arr, h, h);
            }
        });

        leftHalf.start();
        rightHalf.start();

        try {
            leftHalf.join();
            rightHalf.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Время выполнения операций в массиве в два потока: "
                                        + (System.currentTimeMillis() - time));
    }

    public static void main(String[] args) {
        simpleMethodMakeArrayAndCalculatingInIt();

        System.out.println();

        multiThreadsMethodMakeArrayAndCalculatingInIt();

    }
}
