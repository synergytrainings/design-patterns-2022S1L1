package Composite.example2WithBridge.Interfaces;

public interface IFastFood {
    double getCostPrice();
    void SaleFastFood(ICashier cashier);
    void Add(IFastFood ingredient);
    void Remove(IFastFood ingredient);
    double getPrice();
    void setPrice(int percent);
}

