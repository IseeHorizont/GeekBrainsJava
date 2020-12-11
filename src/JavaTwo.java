
public class JavaTwo {
    public static final int size = 10000000;
    public static final int h = size / 2;

    public static float[] arr1 = new float[size];
    public static float[] arr2 = new float[size];

    public static void simpleMethodMakeArrayAndCalculatingInIt(){

        //float[] arr1 = new float[size];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время выполнения операций вычисления в массиве в одном потоке: "
                                                + (System.currentTimeMillis() - startTime));
    }

    public static void multiThreadsMethodMakeArrayAndCalculatingInIt(){
        //float[] arr2 = new float[size];
        final float[] leftSide = new float[h];
        final float[] rightSide = new float[h];

        for (int i = 0; i < size; i++) {
            arr2[i] = 1;
        }
        long time = System.currentTimeMillis();
        System.arraycopy(arr2, 0, leftSide, 0, h);
        System.arraycopy(arr2, h, rightSide, 0, h);

        final Thread leftHalf = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < h; i++) {
                    leftSide[i] = (float)(leftSide[i] * Math.sin(0.2f + i / 5)
                                    * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        final Thread rightHalf = new Thread(new Runnable() {
            @Override
            public void run() {
                int strafe = h;
                for (int i = 0; i < h; i++) {
                    rightSide[i] = (float)(rightSide[i] * Math.sin(0.2f + (i+strafe) / 5)
                                    * Math.cos(0.2f + (i+strafe) / 5) * Math.cos(0.4f + (i+strafe) / 2));
                }

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
        System.arraycopy(leftSide, 0, arr2, 0, h);
        System.arraycopy(rightSide, 0, arr2, h, h);

        System.out.println("Время выполнения операций в массиве в два потока: "
                                        + (System.currentTimeMillis() - time));
    }

    public static boolean compareArrays(float[] arr1, float[] arr2){
        boolean compareRes = true;
        for (int i = 0; i < size; i++) {
            if(arr1[i] != arr2[i]){
                compareRes = false;
            }
        }
        return compareRes;
    }

    public static void main(String[] args) {
        simpleMethodMakeArrayAndCalculatingInIt();

        multiThreadsMethodMakeArrayAndCalculatingInIt();

        System.out.println(compareArrays(arr1, arr2));

    }
}
