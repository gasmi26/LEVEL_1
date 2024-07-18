
import java.util.Scanner;

public class TASK_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of grades: ");
        int numGrades = sc.nextInt();

       
        double[] grades = new double[numGrades];

        
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }
        sc.close();

        
        double averageGrade = 0;
        for (double grade : grades) {
            averageGrade += grade;
        }
        averageGrade /= numGrades;

       
        System.out.printf("Average grade: %.2f%n", averageGrade);
    }
}