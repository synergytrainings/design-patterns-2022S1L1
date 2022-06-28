package com.company;

public class WeekSchedule {

    public static void main(String[] args) {
        DailySchedule MondaySchedule = new DailySchedule.Builder().hasAlgebra()
                                            .hasCalculus().hasComputerNetwork().build();
        DailySchedule TuesdaySchedule = new DailySchedule.Builder().hasOperatingSystems().hasProbability().build();
        DailySchedule WednesdaySchedule = new DailySchedule.Builder().hasDiscreteMathematics().hasCalculus()
                                                .hasProbability().build();
        DailySchedule ThursdaySchedule = new DailySchedule.Builder().hasAlgebra().hasOperatingSystems().build();
        DailySchedule FridaySchedule = new DailySchedule.Builder().hasDiscreteMathematics().hasProbability().build();

        System.out.println("Monday:" +  MondaySchedule );
        System.out.println("Tuesday:" +  TuesdaySchedule );
        System.out.println("Wednesday:" +  WednesdaySchedule );
        System.out.println("Thursday:" +  ThursdaySchedule );
        System.out.println("Friday:" +  FridaySchedule );
    }
}
