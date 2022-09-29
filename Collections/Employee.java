class Employee implements Comparable<Employee>{
    Double Age;
    Double Salary;
    String firstName;
    String lastName;

    public Employee(String firstName, String lastName, Double Salary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.Salary =Salary;
            }
    public String toString() {
            return firstName + " " + lastName;
            }

    @Override
    public int compareTo(Employee employee) {
        int compareValue = this.firstName.compareTo(employee.firstName);
        if (compareValue == 0) {
            return this.lastName.compareTo(employee.lastName);
        }
        return compareValue;
    }
}