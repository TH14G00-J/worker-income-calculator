import model.Department;
import model.HourContract;
import model.Worker;
import model.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Worker worker;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.print("name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String enumWorkerLever = sc.next();
        System.out.print("Base salary: ");
        Double baseSalary = sc.nextDouble();
        worker = new Worker(workerName, WorkerLevel.valueOf(enumWorkerLever.toUpperCase()), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            System.out.printf("Enter contract #%d° data:%n ", i);
            System.out.print("Date (DD/MM/YYYY): ");
            String input = sc.next();
            LocalDate date = LocalDate.parse(input, formatter);
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            System.out.print("Duration: (hours): ");
            int hours = sc.nextInt();
            worker.addContracts(new HourContract(date, valuePerHour, hours));
        }

        System.out.print("Enter month and year to calculate income (MM YYYY): ");
        int month = sc.nextInt();
        int year = sc.nextInt();

        System.out.println();
        System.out.printf("""
        Worker: %s
        Department: %s
        Income for %02d/%d: %.2f
        """,
                worker.getName(),
                worker.getDepartment().getName(),
                month, year, worker.income(year, month));
        sc.close();
    }
}