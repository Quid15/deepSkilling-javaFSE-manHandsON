public class Forecaster{
    public static void main(String[] args) {
        Forecasting forecaster = new Forecasting();
        
        double initialInvestment = 10000.0;
        double annualGrowthRate = 0.05;     
        int yearsToPredict = 10;
        
        System.out.println("--- Financial Forecasting ---");
        System.out.printf("Initial Value: $%.2f%n", initialInvestment);
        System.out.println("Annual Growth Rate: 5%");
        
        double futureValue = forecaster.predictFutureValue(initialInvestment, annualGrowthRate, yearsToPredict);
        System.out.printf("Predicted Value after %d years (Standard): $%.2f%n", yearsToPredict, futureValue);
        
        double optimizedValue = forecaster.predictOptimized(initialInvestment, annualGrowthRate, yearsToPredict);
        System.out.printf("Predicted Value after %d years (Optimized): $%.2f%n", yearsToPredict, optimizedValue);
        
        double year5Value = forecaster.predictOptimized(initialInvestment, annualGrowthRate, 5);
        System.out.printf("Predicted Value after 5 years (Fetched from Cache): $%.2f%n", year5Value);
    }
}
