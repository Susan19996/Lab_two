import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
    float pointTotal;
    float earnedPoints;
    float assignmentPercentage; 
    float totalWeightedGrade;

    Scanner sc = new Scanner(System.in);
    System.out.println("What's student's point Total ?");
    pointTotal = sc.nextInt();
    System.out.println("What's student's earnedPoints ?");
    earnedPoints = sc.nextInt();
    System.out.println("What's student's Assignmentpercent ?");
    assignmentPercentage = sc.nextFloat();
    
    WeighGrades wg = new WeighGrades(pointTotal,earnedPoints,assignmentPercentage);

    totalWeightedGrade = wg.calculate();
    
    System.out.println("The total WeightedGrade is " + totalWeightedGrade);

    sc.close();

    }


}
