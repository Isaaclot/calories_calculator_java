package calories;

import java.text.DecimalFormat;

/**
 * @author
 * @since 2020/3/6 2:56 PM
 */
public class Person {
    private GenderEnum byGender;
    protected Double weight;
    protected Double inch;
    protected Double age;
    protected Double feet;

    private DecimalFormat decimalFormat = new DecimalFormat("#.######");


    public Person(GenderEnum gender, Double weight, Double inch, Double age, Double feet) {
        this.byGender = gender;
        this.weight = weight;
        this.inch = inch;
        this.age = age;
        this.feet = feet;
    }

    public String calculateCalories() {
        double calories = byGender.getBaseCalories()
                + (byGender.getWeightFactor() * weight)
                + (byGender.getFeetFactor() * ((feet * 12)
                + inch))
                - (byGender.getAgeFactor() * age);
        return decimalFormat.format(calories);
    }

}
