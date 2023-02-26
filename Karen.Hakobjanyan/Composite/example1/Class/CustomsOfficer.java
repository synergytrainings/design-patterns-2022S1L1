package Composite.example1.Class;

import Composite.example1.Interface.IOfficer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomsOfficer implements IOfficer {
    private String name;
    private String position;
    private double salary;
    private double income = 0;

    private List<IOfficer> subordinates = new ArrayList<>();
    private IOfficer chief;

    public CustomsOfficer(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.income += salary;
    }

    public void Add(IOfficer subordinate){
        subordinate.SetChief(this);
        subordinates.add(subordinate);
    }

    @Override
    public void Remove(IOfficer subordinate){
        subordinates.remove(subordinate);
    }

    @Override
    public double GetSalary(){
        return salary;
    }

    @Override
    public void SetChief(IOfficer chief){
        this.chief = chief;
    }

    public double GetIncome(){
        return income;
    }

    @Override
    public void SetBribe(double bribe) {
        if(Objects.nonNull(chief)){
            chief.SetBribe(bribe / 2);
            bribe -= bribe / 2;
        }
        this.income += bribe;
    }

    @Override
    public double GetSalaryExpanse() {
        double totalSalary = salary;
        for(IOfficer subordinate : subordinates){
            totalSalary += subordinate.GetSalaryExpanse();
        }
        return totalSalary;
    }

}
