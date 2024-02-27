public class RewardValue {
    private final double cashValue;
    private final int milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    // Method to return the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to return the miles value
    public int getMilesValue() {
        return milesValue;
    }
}
