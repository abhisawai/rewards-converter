public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    // Constructor that accepts miles value
    public RewardValue(double milesValue, boolean isMiles) {
        try{
            this.milesValue = milesValue;
            this.cashValue = convertToCash(milesValue);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    // Method to get the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value of the RewardValue
    public double getMilesValue() {
        return milesValue;
    }

    // Helper method to convert cash to miles
    private double convertToMiles(double cashValue) {
        return cashValue / 0.0035;
    }

    // Helper method to convert miles to cash
    private double convertToCash(double milesValue) {
        return milesValue * 0.0035;
    }
}
