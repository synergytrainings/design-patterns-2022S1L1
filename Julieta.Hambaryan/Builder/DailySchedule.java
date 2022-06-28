package com.company;

public class DailySchedule {

    private final boolean algebra;
    private final boolean probability;
    private final boolean calculus;
    private final boolean operatingSystems;
    private final boolean computerNetwork;
    private final boolean discreteMathematics;

    public static class Builder{
        private boolean algebra ;
        private boolean probability;
        private boolean calculus;
        private boolean operatingSystems;
        private boolean computerNetwork;
        private boolean discreteMathematics;

        public Builder hasAlgebra(){
            this.algebra = true;
            return this;
        }

        public Builder hasProbability(){
            this.probability = true;
            return this;
        }

        public  Builder hasCalculus(){
            this.calculus = true;
            return this;
        }

        public Builder hasOperatingSystems(){
            this.operatingSystems = true;
            return this;
        }

        public Builder hasComputerNetwork(){
            this.computerNetwork = true;
            return this;
        }

        public Builder hasDiscreteMathematics(){
            this.discreteMathematics = true;
            return this;
        }

        public DailySchedule build(){
            return new DailySchedule(this);
        }
    }

    public DailySchedule(Builder builder) {
        this.algebra = builder.algebra;
        this.probability = builder.probability;
        this.calculus = builder.calculus;
        this.operatingSystems = builder.operatingSystems;
        this.computerNetwork = builder.computerNetwork;
        this.discreteMathematics = builder.discreteMathematics;
    }

    @Override
    public String toString(){
        StringBuilder dailySchedule = new StringBuilder();
        if(this.algebra){
            dailySchedule.append("algebra").append("\n");
        } if (this.probability){
            dailySchedule.append("probability ");
        } if (this.calculus){
            dailySchedule.append("calculus ");
        } if (this.operatingSystems ){
            dailySchedule.append("operating systems ");
        } if (this.computerNetwork){
            dailySchedule.append("computer network ");
        } if(this.discreteMathematics){
            dailySchedule.append("discrete mathematics");
        }

        return dailySchedule.toString();
    }

}
