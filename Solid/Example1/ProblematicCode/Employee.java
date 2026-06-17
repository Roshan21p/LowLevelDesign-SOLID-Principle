public class Employee {
    private int id;
    private String name;
    private String address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void printPerformanceReport() {
        // code to print performance report
        System.out.println("Performance report for employee: " + name);
    }

    public double computeSalary() {
        // code to compute salary
        return 50000.0; // example salary
    }

    public void updateEmployeeDetails(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println("Employee details updated successfully. ");
    }

    public void fetchEmployeeDetails() {
        // code to fetch employee details
        System.out.println("Employee data fetched successfully.");
    }
}