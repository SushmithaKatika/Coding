abstract class Employee{
    protected String name;
    protected int baseSalary = 2000;

    public Employee(String name){
        this.name = name;
    }
    // public int calculateSalary(){
    //     return baseSalary;
    // } 

    public abstract int calculateSalary();

    @Override
    public String toString(){
        return name + " earns " + calculateSalary();
    }
}