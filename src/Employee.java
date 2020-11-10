public class Employee {

    String fullName;
    String position;
    String eMail;
    String phone;
    int salary;
    int age;

    public Employee(String fullName, String position, String eMail, String phone, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfoOfEmployee(){
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + eMail);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

}
