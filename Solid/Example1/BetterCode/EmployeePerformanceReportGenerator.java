public class EmployeePerformanceReportGenerator {

    public void printPerformanceReport(Employee employee) {
        // code to print performance report based on employee details
        // Use employee.toString() to avoid relying on a specific getter name
        System.out.println("Performance report for employee: " + employee.toString());
    }
}
