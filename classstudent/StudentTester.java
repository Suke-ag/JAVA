package classstudent;
// package studenttester;
// import classstudent.*;
import java.util.Scanner;

public class StudentTester{
    public static void clearScreen() {   
        System.out.print("\033[H\033[2J");   
        System.out.flush();   
       } 
   public static void main(String[] args){
    Student obj = new Student();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Student Name, Id, Qualifying marks, Year of Engineering , Residential status");
    
    String sname = sc.next();
    int sid = sc.nextInt();
    float smarks = sc.nextFloat();
    int year = sc.nextInt();
    char address = sc.next().charAt(0);
    
    obj.setName(sname);
    obj.setStudentId(sid);
    obj.setQualifyingExamMarks(smarks);
    obj.setYearOfEngg(year);
    obj.setResidentialStatus(address);
    clearScreen();

    System.out.println("Student Name        : " +obj.getName());
    System.out.println("Student Id          : " +obj.getStudentId());
    System.out.println("Qualifying marks    : " +obj.getQualifyingExamMarks());
    System.out.println("Year of Engineering : " +obj.getYearOfEngg());
    System.out.println("Residential status  : " +obj.getResidentialStatus());
    sc.close();
    }
}
