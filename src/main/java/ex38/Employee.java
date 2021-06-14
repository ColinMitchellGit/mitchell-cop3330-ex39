package ex38;

public class Employee {
    private String firstName;
    private String lastName;
    private String department;
    private String separationDate;

    public Employee(String firstName, String lastName, String department, String separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = department;
        this.separationDate = separationDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setseparationDate(String separationDate) {
        this.separationDate = separationDate;
    }

    public String getseparationDate() {
        if(separationDate.equals("00000000")) {
            return "";
        }
        return separationDate;
    }

    public String getName() {
        return String.format("%s %s", getFirstName(), getLastName());
    }

    @Override
    public String toString() {
        return String.format("%-20s" + "|" + "%-19s" + "|" + "%s",
                getFirstName() + " " + getLastName(), " " + getDepartment(), " " + getseparationDate());
    }
}