import java.util.HashMap;

public class Forecasting{
    private final HashMap<Integer, Double> memoizationCache;

    public Forecasting(){
        this.memoizationCache = new HashMap<>();
    }

    public double predictFutureValue(double currentVal, double rate, int years){
        if (years == 0){
            return currentVal;
        }
        return predictFutureValue(currentVal *(1 + rate), rate, years - 1);
    }

    public double predictOptimized(double initialVal, double rate, int targetYear){
        if (memoizationCache.containsKey(targetYear)){
            return memoizationCache.get(targetYear);
        }
        if (targetYear == 0){
            return initialVal;
        }

        double previousYearValue = predictOptimized(initialVal, rate, targetYear - 1);
        double thisYearValue = previousYearValue * (1 + rate);

        
        memoizationCache.put(targetYear, thisYearValue);
        
        return thisYearValue;
    }
}