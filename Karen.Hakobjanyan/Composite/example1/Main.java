package Composite.example1;

import Composite.example1.Class.CustomsOfficer;
import Composite.example1.Interface.IOfficer;

public class Main {
    public static void main(String[] args) {
        IOfficer customsOfficer1 = new CustomsOfficer("Bob", "Customs Officer", 100000);
        IOfficer customsOfficer2 = new CustomsOfficer("Tom", "Customs Officer", 100000);
        IOfficer customsOfficer3 = new CustomsOfficer("Jack", "Customs Officer", 100000);
        IOfficer customsOfficer4 = new CustomsOfficer("Sem", "Customs Officer", 100000);
        IOfficer customsOfficer5 = new CustomsOfficer("Jane", "Customs Officer", 100000);
        IOfficer customsOfficer6 = new CustomsOfficer("Tim", "Customs Officer", 100000);
        IOfficer customsOfficer7 = new CustomsOfficer("Anna", "Customs Officer", 100000);
        IOfficer customsOfficer8 = new CustomsOfficer("Kate", "Customs Officer", 100000);
        IOfficer customsOfficer9 = new CustomsOfficer("John", "Customs Officer", 100000);


        IOfficer chiefCustomsOfficer1 = new CustomsOfficer("Mark", "Chief Customs Officer", 200000);
        IOfficer chiefCustomsOfficer2 = new CustomsOfficer("Mikael", "Chief Customs Officer", 200000);
        IOfficer chiefCustomsOfficer3 = new CustomsOfficer("David", "Chief Customs Officer", 200000);

        chiefCustomsOfficer1.Add(customsOfficer1);
        chiefCustomsOfficer1.Add(customsOfficer2);
        chiefCustomsOfficer1.Add(customsOfficer3);

        chiefCustomsOfficer2.Add(customsOfficer4);
        chiefCustomsOfficer2.Add(customsOfficer5);
        chiefCustomsOfficer2.Add(customsOfficer6);

        chiefCustomsOfficer3.Add(customsOfficer7);
        chiefCustomsOfficer3.Add(customsOfficer8);
        chiefCustomsOfficer3.Add(customsOfficer9);

        IOfficer headOfCustomsDepartment = new CustomsOfficer("Don", "Head of department", 500000);
        headOfCustomsDepartment.Add(chiefCustomsOfficer1);
        headOfCustomsDepartment.Add(chiefCustomsOfficer2);
        headOfCustomsDepartment.Add(chiefCustomsOfficer3);

        System.out.println("Salary expanse and incomes before bribe");
        System.out.println();
        System.out.println("Salary Expense " + headOfCustomsDepartment.GetSalaryExpanse());
        System.out.println("Head income: " + headOfCustomsDepartment.GetIncome());
        System.out.println("Chief Officer income: " + chiefCustomsOfficer1.GetIncome());

        System.out.println("Customs Officer income " + customsOfficer1.GetIncome());

        System.out.println();
        System.out.println("Salary expanse and incomes after bribe");
        System.out.println();
        customsOfficer1.SetBribe(10000);
        customsOfficer2.SetBribe(10000);
        customsOfficer3.SetBribe(10000);
        customsOfficer4.SetBribe(10000);
        customsOfficer5.SetBribe(10000);
        customsOfficer6.SetBribe(10000);
        customsOfficer7.SetBribe(10000);
        customsOfficer8.SetBribe(10000);
        customsOfficer9.SetBribe(10000);

        System.out.println("Salary Expense " + headOfCustomsDepartment.GetSalaryExpanse());

        System.out.println("Head income: " + headOfCustomsDepartment.GetIncome());
        System.out.println("Chief Officer income: " + chiefCustomsOfficer1.GetIncome());
        System.out.println("Customs Officer income " + customsOfficer1.GetIncome());


    }
}
