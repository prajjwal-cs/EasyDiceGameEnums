public enum DiceOutcomes {
    One(1),
    Two(2),
    Three(3),
    Four(4),
    Five(5),
    Six(6);

    private final int value;

    DiceOutcomes(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
