package model;

import java.time.LocalDate;

public class HourContract {
    private LocalDate date;
    private Double valuesPerHour;
    private Integer hours;

    public HourContract(LocalDate date, Double valuesPerHour, Integer hours) {
        this.date = date;
        this.valuesPerHour = valuesPerHour;
        this.hours = hours;
    }

    public Double totalValue() {
        return valuesPerHour * hours;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getValuesPerHour() {
        return valuesPerHour;
    }

    public void setValuesPerHour(Double valuesPerHour) {
        this.valuesPerHour = valuesPerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
