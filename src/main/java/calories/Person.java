package calories;

import java.text.DecimalFormat;

/**
 * @author
 * @since 2020/3/6 2:56 PM
 */
public class Person {
    private GenderCalorieParameter calorieParameter;
    protected Double weight;
    protected Double inch;
    protected Double age;
    protected Double feet;

    private DecimalFormat decimalFormat = new DecimalFormat("#.######");


    public Person(GenderCalorieParameter gender, Double weight, Double inch, Double age, Double feet) {
        this.calorieParameter = gender;
        this.weight = weight;
        this.inch = inch;
        this.age = age;
        this.feet = feet;
    }

    public String calculateCalories() {
        double calories = calorieParameter.getBaseCalories()
                + (calorieParameter.getWeightFactor() * weight)
                + (calorieParameter.getFeetFactor() * ((feet * 12)
                + inch))
                - (calorieParameter.getAgeFactor() * age);
        return decimalFormat.format(calories);
    }

}
