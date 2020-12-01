import java.util.*;

public class ListOfPhoneNumbers {

    private Map<String, List<String>> listOfPhoneNumbers;

    public ListOfPhoneNumbers(){
        listOfPhoneNumbers = new HashMap<String, List<String>>();
    }

    public void add(String surname, String phoneNumber){
        List<String> list = listOfPhoneNumbers.get(surname);
        if(list == null){
            list = new ArrayList<String>();
            listOfPhoneNumbers.put(surname, list);
        }
        list.add(phoneNumber);
    }

    public void print(){
        for (Map.Entry item: listOfPhoneNumbers.entrySet()) {
            System.out.println("Фамилия: " + item.getKey() + " телефон: " + item.getValue());
        }
    }

    public void get(String surname){
        for (Map.Entry item: listOfPhoneNumbers.entrySet()) {
            if(surname == item.getKey()){
                System.out.println("Результаты поиска по фамилии " + surname + ":");
                System.out.println(item.getValue());
            }
        }
    }
}
