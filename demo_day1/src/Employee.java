public class Employee {

    public static void main(String[] args) {
        EmployeeDatabase employeeDatabase = new EmployeeDatabase(){
            @Override
            public String inquiry() {
                return "Hey !!!";
            }
        };
        Employee employee = new Employee();
        String result = employee.getDetail(employeeDatabase);
        System.out.println(result);
    }

    private String getDetail(EmployeeDatabase employeeDatabase) {
        return employeeDatabase.inquiry();
    }

}
