class Employee{
    String fullName;
    int salary;
    String city;

    public Employee(String fullName, int salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }
}