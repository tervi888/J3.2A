public class BmiService {
    public int calculate(int weight, double height) {
        double heightSquared = (height * height);
        double bmi = weight / heightSquared;
        return (int) bmi;
    }
}
