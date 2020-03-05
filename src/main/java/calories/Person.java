package calories;

import java.text.DecimalFormat;

public abstract class Person {

    protected DecimalFormat decimalFormat = new DecimalFormat("#.######");
    protected Double weight;
    protected Double height;
    protected Double inch;
    protected Double age;

    protected double weightFactor;
    protected double heightFactor;
    protected double ageFactor;
    protected int baseCalories;

    int feetTransferInchFactor = 12;


    public Person(Double weight, Double height, Double inch, Double age) {
        this.weight = weight;
        this.height = height;
        this.inch = inch;
        this.age = age;
    }

    public Double caloriesCalculator() {
        Double calories = baseCalories
                + (weightFactor * weight)
                + (heightFactor * ((height * feetTransferInchFactor)
                + inch))
                - (ageFactor * age);
        return Double.valueOf(decimalFormat.format(calories));
    }
}