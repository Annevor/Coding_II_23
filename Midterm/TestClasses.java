package Midterm;

public class TestClasses {
    public static void main(String[] args) {
        Employee rob = new Employee("rObeRt foRster", "46285", 65000);
        Rectangle rec = new Rectangle(331.57, 763.13);
        System.out.println("Employee Name: " +rob.getName());
        System.out.println("Employee Salary: " +rob.getEmployeeSalary());
        System.out.println("Employee ID" +rob.getEmployeeId());
        System.out.println("\nEnter rectangle: \n\nRectangle Area: " +rec.getArea());
        System.out.println("Rectangle Perimeter: " +rec.getPerimeter());
    }
}
