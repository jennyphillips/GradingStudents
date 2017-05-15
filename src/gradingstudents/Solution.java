package gradingstudents;

import java.util.*;

public class Solution {
    
    static Scanner scanner = new Scanner(System.in);
    
    static int[] solve(int[] grades){
        int lowestGrade = 38;
        int lowestDifference = 3;
        int[] newGrades = new int[grades.length];
        
        for (int i = 0, max = grades.length; i < max; i++) {
            if (grades[i] < 0 || grades[i] > 100) throw new IllegalArgumentException("Invalid grade indicated "+grades[i]);
            else {
                if (grades[i] == 0 || grades[i] == 100) newGrades[i] = grades[i];
                if (grades[i] < lowestGrade) newGrades[i] = grades[i];
                else {
                    int currGrade = grades[i];
                    int nextMult5 = currGrade + (5-(currGrade%5));
                    int difference = nextMult5 - currGrade;
                    if (difference < lowestDifference) newGrades[i] = nextMult5;
                    else newGrades[i] = currGrade;
                }
            }
        }
        return newGrades;
    }

    public static void main(String[] args) {
        int numberGrades = scanner.nextInt();
        if(numberGrades < 1 || numberGrades > 60) throw new IllegalArgumentException("Invalid number of grades indicated "+numberGrades);
        int[] grades = new int[numberGrades];
        for(int grades_i=0; grades_i < numberGrades; grades_i++){
            grades[grades_i] = scanner.nextInt();
        }
        System.out.println("---------");
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        scanner.close();
    }

}
