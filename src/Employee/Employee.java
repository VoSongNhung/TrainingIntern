package Employee;

import java.util.Scanner;

public class Employee{
    Scanner scanner = new Scanner(System.in,"UTF-8");
    private int ID;
    private String Name;
    private int Age;
    private int Position;
    private int Day;
    private int Overtime;
    public Employee(int iD, String name, int age, int position, int day, int overtime) {
        super();
        ID = iD;
        Name = name;
        Age = age;
        Position = position;
        Day = day;
        Overtime = overtime;
    }
    public Employee() {
        super();
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public int getPosition() {
        return Position;
    }
    public void setPosition(int position) {
        Position = position;
    }
    public int getDay() {
        return Day;
    }
    public void setDay(int day) {
        Day = day;
    }
    public int getOvertime() {
        return Overtime;
    }
    public void setOvertime(int overtime) {
        Overtime = overtime;
    }
    public double Salary() {
        return 0;
    }

    public void Show() {
        System.out.println("Total number money by "+getName()+" is:"+Salary());
    }

    public void InputInf(int id,int pos) {
        // TODO Auto-generated method stu

        ID = id;

        System.out.println("Input Full Name: ");
        Name = scanner.nextLine();

        System.out.println("Input Age: ");
        Age = scanner.nextInt();

        Position = pos;

        System.out.println("Input numer day work: ");
        Day = scanner.nextInt();

        System.out.println("Do overtime?(0 or 1): ");
        Overtime = scanner.nextInt();
    }
    public String Highest(Employee employee[]){
        return "";
    }
}
