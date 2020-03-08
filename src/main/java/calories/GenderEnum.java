package calories;

/**
 * @author
 * @since 2020/3/8 9:09 PM
 */
public enum GenderEnum {
    MALE("Male", 66, 6.3D, 12.9D, 6.8D),
    FEMALE("Female", 655, 4.3D, 4.7D, 4.7D),
    X0("X0", 660, 4.3D, 4.7D, 4.7D),
    X1("X1", 661, 4.3D, 4.7D, 4.7D),
    X2("X2", 662, 4.3D, 4.7D, 4.7D),
    X3("X3", 663, 4.3D, 4.7D, 4.7D),
    X4("X4", 664, 4.3D, 4.7D, 4.7D),
    X5("X5", 665, 4.3D, 4.7D, 4.7D),
    X6("X6", 666, 4.3D, 4.7D, 4.7D),
    X7("X7", 667, 4.3D, 4.7D, 4.7D),
    X8("X8", 668, 4.3D, 4.7D, 4.7D),
    X9("X9", 669, 4.3D, 4.7D, 4.7D)
    ;

    private String garden;
    private int baseCalories;
    private double weightFactor;
    private double feetFactor;
    private double ageFactor;

    GenderEnum(String garden, int baseCalories, double weightFactor, double feetFactor, double ageFactor) {
        this.garden = garden;
        this.baseCalories = baseCalories;
        this.weightFactor = weightFactor;
        this.feetFactor = feetFactor;
        this.ageFactor = ageFactor;
    }

    public static GenderEnum getByGarden(String name) {
        for (GenderEnum value : GenderEnum.values()) {
            if (value.getGarden().equals(name)) return value;
        }
        return null;
    }

    public String getGarden() {
        return garden;
    }

    public int getBaseCalories() {
        return baseCalories;
    }

    public double getWeightFactor() {
        return weightFactor;
    }

    public double getFeetFactor() {
        return feetFactor;
    }

    public double getAgeFactor() {
        return ageFactor;
    }
}
