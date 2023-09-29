package Midterm;

public class Employee{
    private String employeeName;
    private String employeeId;
    private int employeeSalary;
    private String firstName;
    private String lastName;
    private int spaceIdx;


    //Constructor
    public Employee(String employeeName, String employeeId, int employeeSalary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }


    //Methods
    public String getName(){
        for(int i = 0; i < employeeName.length(); i++){
            this.spaceIdx = employeeName.indexOf(" ");
        }
        lastName = employeeName.substring(spaceIdx + 1, employeeName.length());
        firstName = employeeName.substring(0, spaceIdx);
        firstName.toLowerCase();
        lastName.toLowerCase();
        Character.toUpperCase(firstName.charAt(0));
        Character.toUpperCase(lastName.charAt(0));
        return(lastName +", " +firstName);
    }


    //Getters & Setters
    public String getEmployeeId() {
        return employeeId;
    }


    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }


    public int getEmployeeSalary() {
        return employeeSalary;
    }


    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}