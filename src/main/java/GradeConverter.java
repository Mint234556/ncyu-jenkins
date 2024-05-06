public class GradeConverter {

    public String convert(int score) {
        if (score <= 100 && score >= 90) {
            return "A";
        } else if (score < 90 && score >= 80) {
            return "B";
        } else if (score < 80 && score >= 70) {
            return "C";
        } else if (score < 70 && score >= 60) {
            return "D";
        } else if (score < 60 && score > 0) {
            return "E";
        } else {
            return "Invalid";
        }
    }
}