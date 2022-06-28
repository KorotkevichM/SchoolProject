package by.itstep.Korotkevich.javalessons.lesson22.model.logic;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SchoolManagerTest {

    private static int[][] groups;

 @BeforeClass
 public static void init(){
     groups = new int[][]{
                {7, 7, 8, 2},       //6.0
                {9, 8, 9, 10},      //9.0
                {7, 7, 1},          //5.0
                {8, 8, 10, 10}      //9.0
        };
 }
    @AfterClass
    public static void destroy(){
//        System.out.println("@AfterClass");
        groups = null;
    }

//    @Before
//    public void init(){
//        groups = new int[][]{
//                {7, 7, 8, 2},       //6.0
//                {9, 8, 9, 10},      //9.0
//                {7, 7, 1},          //5.0
//                {8, 8, 10, 10}      //9.0
//        };
//    }

    @Test
    public void calculateAvgMarkPositive(){

        double expected = 7.4;

        double actual = SchoolManager.calculateAvgMark(groups);

        assertEquals(expected, actual, 0.5);

    }

    @Test
    public void findBadStudentGroupsPositive(){

//        int[][] groups = {
//                {7, 7, 8, 2},       //6.0
//                {9, 8, 9, 10},      //9.0
//                {7, 7, 1},          //5.0
//                {8, 8, 10, 10}      //9.0
//        };

        String expected = "1 3";

        String actual = SchoolManager.findBadStudentGroups(groups);

        assertEquals(expected, actual);
    }

    @Test
    public void findGroupsWithoutBadStudentsPositive(){
//        int[][] groups = {
//                {7, 7, 8, 2},       //6.0
//                {9, 8, 9, 10},      //9.0
//                {7, 7, 1},          //5.0
//                {8, 8, 10, 10}      //9.0
//        };

        String expected = "2 4";

        String actual = SchoolManager.findGroupsWithoutBadStudents(groups);

        assertEquals(expected, actual);
    }
}
