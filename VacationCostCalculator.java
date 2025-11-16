public class VacationCostCalculator {

    // Method to calculate total cost
    public static double calculateTotalCost(double accommodationCost, double mealCost, double activityCost) {
        return accommodationCost + mealCost + activityCost;
    }

    public static void main(String[] args) {
        // Sample data
        double accommodationCost = 800.50;
        double mealCost = 400.25;
        double activityCost = 250.00;

        // Calling the method
        double totalCost = calculateTotalCost(accommodationCost, mealCost, activityCost);

        // Displaying result
        System.out.println("Total Vacation Cost: $" + totalCost);
    }
}
