package Employee;

public class KeToan extends Employee {

    public KeToan() {
        super();
        // TODO Auto-generated constructor stub
    }

    public KeToan(int iD, String name, int age, int position, int day, int overtime) {
        super(iD, name, age, position, day, overtime);
        // TODO Auto-generated constructor stub
    }
    public void ListEmployee(Employee employee[]) {
        for (int i = 0; i < employee.length; i++) {
            employee[i].Show();
        }
    }
    @Override
    //Count salary for employee
    public double Salary() {
        // TODO Auto-generated method stub
        if(getOvertime()>0)
            return 500000*getDay()+300000;
        else
            return 500000*getDay();
    }

    @Override
    //Show total money for employee with position is "Kế toán"
    public void Show() {
        // TODO Auto-generated method stub
        System.out.println("Total money for "+getName()+" is: "+Salary());
    }

    @Override
    //Count salary for employee
    public void InputInf(int id,int pos) {
        super.InputInf(id,pos);
    }
}
