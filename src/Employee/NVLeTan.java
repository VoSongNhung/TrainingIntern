package Employee;

public class NVLeTan extends Employee {

    public NVLeTan() {
        super();
        // TODO Auto-generated constructor stub
    }

    public NVLeTan(int iD, String name, int age, int position, int day, int overtime) {
        super(iD, name, age, position, day, overtime);
        // TODO Auto-generated constructor stub
    }

    @Override
    //Count salary for employee
    public double Salary() {
        if(getOvertime()>0)
            return 350000*getDay()+300000;
        else
            return 350000*getDay();
    }

    @Override
    //Show total money for employee with position is "Nhân viên lễ tân"
    public void Show() {
        System.out.println("Total money for "+getName()+" is: "+Salary());
    }

    @Override
    //Input all information for employee
    public void InputInf(int id,int pos) {
        // TODO Auto-generated method stub
        super.InputInf(id,pos);
    }

}
