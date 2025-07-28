public class Manager extends Employee{
    public Manager(String name){
        super(name);
    }
    @Override
    public int calculateSalary(){
        return baseSalary + 100;
    }
}
