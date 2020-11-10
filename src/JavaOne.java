public class JavaOne {

    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];

        employeesArray[0] = new Employee("Thomas Paine", "CEO", "paine@gmail.com",
                "+1-777-555-222", 160000, 41);

        employeesArray[1] = new Employee("Earl Warren", "CTO", "warren@gmail.com",
                "+1-333-555-111", 90000, 25);

        employeesArray[2] = new Employee("John Dewey", "Financial control officer",
                "dewey@gmail.com", "+1-111-555-111", 99000, 33);

        employeesArray[3] = new Employee("George Marshall", "Financial control officer",
                "marshall@gmail.com", "+1-176-565-671", 99000, 40);

        employeesArray[4] = new Employee("Margaret Mead", "Chief creative officer",
                "creative@gmail.com", "+1-123-595-231", 101000, 43);

        for(int i = 0; i < employeesArray.length; i++){
            if(employeesArray[i].age > 40){
                employeesArray[i].printInfoOfEmployee();
                System.out.println();
            }
        }

    }

}
