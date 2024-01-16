package org.jugistanbul.part1.explanatoryvariables.good;

class Hello {
    private int realdays;
    private int[] taskEstimate = new int[100];

    private static final  int WORK_DAYS_PER_WEEK = 5;
    private static final  int NUMBER_OF_TASKS = 5;

    public static void main(String[] args) {
        Hello hello = new Hello();

    }

    public double calculate() {
        this.taskEstimate[0] = 10; // assume comes from db
        this.realdays = 10; // assume comes from db
        int realDaysPerIdealDay = 4;

        int sum = 0;
        for (int j = 0; j < NUMBER_OF_TASKS; j++) {
            int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
            int realTaskWeeks = (realdays / WORK_DAYS_PER_WEEK);
            sum += realTaskWeeks;
        }

        return sum;

    }
}
