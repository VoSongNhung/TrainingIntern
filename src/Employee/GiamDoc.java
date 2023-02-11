package Employee;

public class GiamDoc extends Employee {

    public GiamDoc() {
        super();
        // TODO Auto-generated constructor stub
    }


    public GiamDoc(int iD, String name, int age, int position, int day, int overtime) {
        super(iD, name, age, position, day, overtime);
        // TODO Auto-generated constructor stub
    }

    @Override
    //Count salary for employee
    public double Salary() {
        if(getOvertime()>0)
            return 1500000*getDay()+300000;
        else
            return 1500000*getDay();
    }

    @Override
    //Show total money for employee with position is "Giám đốc"
    public void Show() {
        System.out.println("Total money for "+this.getName()+" is: "+this.Salary());
    }

    @Override
    //Input all information for employee
    public void InputInf(int id,int pos) {
        super.InputInf(id,pos);
    }

    public void ListEmployee(Employee employee[]) {
        for (int i = 0; i < employee.length; i++) {
            employee[i].Show();
        }
    }
    @Override
    public String Highest(Employee[] employee){
        double compare = 0;
        String result = "";
        for(int i=0;i<employee.length;i++){
            if(employee[i].getPosition()!=1)
                compare = employee[i].Salary();
                break;
         }
        for(int i=0;i< employee.length;i++){
            if(compare < employee[i].Salary() && employee[i].getPosition()!=1)
            {
                compare = employee[i].Salary();
                result = "The person with the highest salary is " + employee[i].getName() + " with: " + employee[i].Salary()+"vnd";
            }
        }
            return result;
    }
}
