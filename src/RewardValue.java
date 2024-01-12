public class RewardValue {
    private double value;

    public RewardValue(float cashValue) {
        this.value = cashValue;
    }

    public RewardValue(double milesValue) {
        this.value = milesValue * 0.0035;
    }

    public double getCashValue() {
        return value;
    }

    public double getMilesValue() {
        return value / 0.0035;
    }
}
