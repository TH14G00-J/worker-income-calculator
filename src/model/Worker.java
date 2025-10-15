package model;

import model.enums.WorkerLevel;


import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private List<HourContract> contractList = new ArrayList<>();
    private Department department;

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public void addContracts(HourContract contract) {
        if (contract != null) {
            contractList.add(contract);
        }else {
            System.out.println("The contract cannot be null");
        }
    }

    public void removeContract(HourContract contract) {
        contractList.remove(contract);
    }

    public Double income(int year, int month) {
        double sumContracts =
                contractList.stream().filter(d -> d.getDate().getYear() == year && d.getDate().getMonthValue() == month)
                .mapToDouble(HourContract::totalValue)
                .sum();
        return baseSalary + sumContracts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContract> getContractList() {
        return contractList;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


}
