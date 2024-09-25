public class RewardValue {
    private double cashValue;       // Store cash value
    private int milesValue;         // Store miles value
    private static final double MILES_CONVERSION_RATE = 0.0035; // 1 mile = $0.0035

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = calculateMilesFromCash(cashValue);
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = calculateCashFromMiles(milesValue);
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public int getMilesValue() {
        return milesValue;
    }

    // Method to calculate miles from cash value
    private int calculateMilesFromCash(double cash) {
        return (int) (cash / MILES_CONVERSION_RATE);
    }

    // Method to calculate cash from miles value
    private double calculateCashFromMiles(int miles) {
        return miles * MILES_CONVERSION_RATE;
    }
}
