package Composite.example1.Interface;

public interface IOfficer {
    double GetIncome();
    double GetSalary();
    double GetSalaryExpanse();
    void SetBribe(double bribe);
    void SetChief(IOfficer parent);
    void Add(IOfficer subordinate);
    void Remove(IOfficer subordinate);
}
