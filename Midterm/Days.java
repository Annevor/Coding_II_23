package Midterm;
import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me a month's number: ");
        int monthN = sc.nextInt();
        String month;
        switch(monthN){
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "womp womp";
                break;
        }
        System.out.print("Give me a year: ");
        int year = sc.nextInt();
        if(monthN == 1 || monthN == 3 || monthN == 5 || monthN == 7 || monthN == 8 || monthN == 10 || monthN == 12){
            System.out.println(month + " " +year +" has 31 days");
        }
        if(monthN == 4 || monthN == 6 || monthN == 9 || monthN == 11){
            System.out.println(month + " " +year +" has 30 days");
        }
        if(monthN == 2 && year % 4 == 0){
            System.out.println(month + " " +year +" has 29 days");
        }
        if(monthN == 2 && year % 4 != 0){
            System.out.println(month + " " +year +" has 28 days");
        }
        sc.close();
    }
}
