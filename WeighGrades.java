public class WeighGrades {

    private float pointTotal;
    private float earnedPoints;
    private float assignmentPercentage;
    private float totalWeightedGrade;

    public WeighGrades(float pointTotal, float earnedPoints, float assignmentPercentage) {
        this.pointTotal = pointTotal;
        this.earnedPoints = earnedPoints;
        this.assignmentPercentage = assignmentPercentage;
    }

    public float calculate(){  
        this.totalWeightedGrade = (this.earnedPoints/this.pointTotal)*this.assignmentPercentage*100;
        return this.totalWeightedGrade;
    }
    
}
