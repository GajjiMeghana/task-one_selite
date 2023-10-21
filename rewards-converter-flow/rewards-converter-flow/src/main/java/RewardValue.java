public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    // Constructor accepting miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Example usage in the main method
//    public static void main(String[] args) {
//        // Creating a RewardValue object with cash value $100
//        RewardValue reward1 = new RewardValue(100);
//        System.out.println("Cash Value: $" + reward1.getCashValue());
//        System.out.println("Miles Value: " + reward1.getMilesValue() + " miles");
//
//        // Creating a RewardValue object with miles value 50000
//        RewardValue reward2 = new RewardValue(50000);
//        System.out.println("Cash Value: $" + reward2.getCashValue());
//        System.out.println("Miles Value: " + reward2.getMilesValue() + " miles");
//    }
}
