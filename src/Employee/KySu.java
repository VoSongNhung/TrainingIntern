package Employee;

public class KySu extends Employee {
    private String Type;

    public KySu() {
        super();
    }

    public KySu(String Type) {
        super();
        this.Type = Type;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    //Count salary for employee
    public double Salary() {
        if(getOvertime()>0)
            return 800000*getDay()+300000;
        else
            return 800000*getDay();	}

    @Override
    //Show total money for employee with position is "Kĩ Sư"
    public void Show() {
        System.out.println("Total money for "+getName()+" is: "+Salary());
    }

    @Override
    //Input all information for employee
    public void InputInf(int id,int pos) {
        super.InputInf(id,pos);
        System.out.println("Input type enginer:");
        Type = scanner.nextLine();
    }

}
