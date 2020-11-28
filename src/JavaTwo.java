
public class JavaTwo {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException{

        Object[][] strArray = { {1, 2, 534, 5345, 77},
                                {2, 22, 34, 354},
                                {12, 44, 678, 87},
                                {22, 34, 678, 435}
        };
        try {
            checkArrayOfString(strArray);
        }
        catch(MyArraySizeException ex){

        }
        catch(MyArrayDataException ex){

        }

    }

    public static void checkArrayOfString(Object[][] arr) throws MyArraySizeException, MyArrayDataException{
        if(arr.length > 4){
            throw new MyArraySizeException("Превышено количество строк в массиве");
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length > 4){
                throw new MyArraySizeException("Превышен размер столбца " + (i+1));
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    arr[i][j] = (int) arr[i][j];
                }
                catch(ClassCastException ex){
                    throw new MyArrayDataException("Ошибка приведения к int в строке " + (i+1)
                                                                + " столбца " + (j+1));
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}