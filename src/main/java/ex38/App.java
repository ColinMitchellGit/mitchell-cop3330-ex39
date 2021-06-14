/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ex38;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class App
{
    public static void main(String[] args)
    {
        Employee[] employees = {
                new Employee("John","Johnson","Manager","2016-12-31"),
                new Employee("Tou","Xiong","Software Engineer","2016-10-05"),
                new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"),
                new Employee("Jake","Jacobson","Programmer","00000000"),
                new Employee("Jackquelyn", "Jackson", "DBA","00000000"),
                new Employee("Sally","Webber","Web Developer","2015-12-18")
        };

        displayEmployees(employees);
    }

    public static void displayEmployees(Employee[] employees) {
        List<Employee> list = Arrays.asList(employees);

        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

        Comparator<Employee> lastThenFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);

        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");
        list.stream().sorted(lastThenFirst).forEach(System.out::println);
    }
}
