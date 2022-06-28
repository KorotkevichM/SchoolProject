package by.itstep.Korotkevich.javalessons.lesson22.model.logic;

public class SchoolManager {
    public static double calculateAvgMark(int[][] groups) {
        double sum = 0;
        int count = 0;

        for (int i = 0; i < groups.length; i++) {
            for (int j = 0; j < groups[i].length; j++) {
                sum += groups[i][j];
            }
            count += groups[i].length;
        }

        return sum / count;
    }

    public static String findBadStudentGroups(int[][] groups) {
        String result = "";
        for (int i = 0; i < groups.length; i++) {
            for (int j = 0; j < groups[i].length; j++) {
                if (groups[i][j] < 4){
                    result += (i + 1) + " ";
                    break;
                }
            }
        }
        return result.trim();
    }

    public static String findGroupsWithoutBadStudents(int[][] groups){
        String result = "";
        for (int i = 0; i < groups.length; i++) {
            boolean flag = true;
            for (int j = 0; j < groups[i].length; j++) {
                if (groups[i][j] < 4){
                    flag = false;
                    break;
                }
            }
            if (flag){
                result += (i + 1) + " ";
            }
        }
        return result.trim();
    }

//    private static double calculateGroupAvgMark(int[] group){
//        double sum = 0;
//
//        for (int i = 0; i < group.length; i++) {
//            sum += group[i];
//        }
//        return sum / group.length;
//    }

}

