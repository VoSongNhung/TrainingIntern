package Employee;

import File.ReadFile;
import File.WriteFile;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String Write(Employee employee)
    {
        String line = "";
        line = "Name: " + employee.getName();
        line += " Age: " + employee.getAge();
        line += " Position: " + employee.getPosition();
        line += " Overtime: " + employee.getOvertime();
        line += " Salary: " + employee.Salary();
        return line;
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = "";
        System.out.print("Input number employee: ");
        int number = scanner.nextInt();
        Employee[] employees = new Employee[number];
        WriteFile writeFile = new WriteFile();
        ReadFile readFile = new ReadFile();
        for(int i=0;i<number;i++) {
            System.out.println("Input employee "+(i+1));
            System.out.println("Chosse Position: \n 1: Giám đốc \n 2: Kế toán \n 3: Nhân viên lễ tân \n 4: Nhân viên vệ sinh \n 5: Kĩ sư");
            int pos = scanner.nextInt();
            switch (pos) {
                case 1: {
                    employees[i] = new GiamDoc();
                    employees[i].InputInf(i,pos);
                    writeFile.writeFile(Write(employees[i]));
                    employees[i].Salary();
                    break;
                }
                case 2: {
                    employees[i] = new KeToan();
                    employees[i].InputInf(i,pos);
                    writeFile.writeFile(Write(employees[i]));
                    employees[i].Salary();
                    break;

                }
                case 3: {
                    employees[i] = new NVLeTan();
                    employees[i].InputInf(i,pos);
                    writeFile.writeFile(Write(employees[i]));
                    employees[i].Salary();
                    break;

                }
                case 4: {
                    employees[i] = new NVVeSinh();
                    employees[i].InputInf(i,pos);
                    writeFile.writeFile(Write(employees[i]));
                    employees[i].Salary();
                    break;

                }
                case 5: {
                    employees[i] = new KySu();
                    employees[i].InputInf(i,pos);
                    writeFile.writeFile(Write(employees[i]));
                    employees[i].Salary();
                    break;

                }
                default:
                    throw new IllegalArgumentException("Unexpected value: " + pos);
            }

        }
        readFile.readFile();
        System.out.println("Chosse ID position employee: ");
        int chosse = scanner.nextInt();
        //while (chosse<0 && chosse>5){
            switch (chosse) {
                case 1: {
                    GiamDoc employeegd = new GiamDoc();
                    //Call method get all employee
                    employeegd.ListEmployee(employees);
                    //Call method search highest employee
                    String hightestEmpl = employeegd.Highest(employees);
                    if(hightestEmpl.equals("")){
                        System.out.println("Don't have employee!!!");
                    }
                    else
                        System.out.println(hightestEmpl);
                    break;
                }
                case 2: {
                    KeToan employeekt = new KeToan();
                    employeekt.ListEmployee(employees);
                    break;
                }
                case 3: {
                    for (int i = 0; i < number; i++) {
                        if(employees[i].getPosition()==3){
                            employees[i].Show();
                        }
                    }
                    break;

                }
                case 4: {
                    for (int i = 0; i < number; i++) {
                        if(employees[i].getPosition()==4){
                            employees[i].Show();
                        }
                    }
                    break;

                }
                case 5: {
                    for (int i = 0; i < number; i++) {
                        if(employees[i].getPosition()==5){
                            employees[i].Show();
                        }
                    }
                    break;
                }
            }
            //System.out.println("Try input type ");
        //}
    }
}
