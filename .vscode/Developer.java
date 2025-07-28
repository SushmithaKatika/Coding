class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }

    @Override
    public int calculateSalary() {
        return baseSalary + 200;
    }
}