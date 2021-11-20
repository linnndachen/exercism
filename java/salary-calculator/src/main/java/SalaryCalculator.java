public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped > 5 ? 0.85 : 1;
        // throw new UnsupportedOperationException("Please implement the SalaryCalculator.multiplierPerDaysSkipped() method");
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold > 20 ? 13 : 10;
        // throw new UnsupportedOperationException("Please implement the SalaryCalculator.multiplierPerProductsSold() method");
    }

    public double bonusForProductSold(int productsSold) {
        return multiplierPerProductsSold(productsSold) * productsSold;
        // throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusForProductSold() method");
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double res = (1000 * multiplierPerDaysSkipped(daysSkipped)) + bonusForProductSold(productsSold);
        return res > 2000 ? 2000 : res;
        // throw new UnsupportedOperationException("Please implement the SalaryCalculator.finalSalary() method");
    } 
}
