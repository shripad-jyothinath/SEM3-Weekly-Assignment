import java.util.*;
public class BMICalculator {
    static String getBmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }
    static void printWellnessReport(double[] heights, double[] weights) {
        System.out.println("Person | Height(m) | Weight(kg) | BMI   | Status");
        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            System.out.printf("%6d | %9.2f | %10.1f | %5.2f | %s%n",
                i + 1, heights[i], weights[i], bmi, getBmiStatus(bmi));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int n = sc.nextInt();
        double[] heights = new double[n];
        double[] weights = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (m) and weight (kg) for Person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            weights[i] = sc.nextDouble();
        }
        printWellnessReport(heights, weights);
    }
}
