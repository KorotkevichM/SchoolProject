package by.itstep.Korotkevich.javalessons.lesson22.model.logic;

public class SchoolManager {
    public static double calculateAvgMark(int[][] groups) {
        double sum = 0;

        for (int i = 0; i < groups.length; i++) {
            sum += calculateGroupAvgMark(groups[i]);
        }

        return sum / groups.length;
    }

    private static double calculateGroupAvgMark(int[] group){
        double sum = 0;

        for (int i = 0; i < group.length; i++) {
            sum += group[i];
        }
        return sum / group.length;
    }

}

