package calories;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/6 2:56 PM
 */
public class Person {
    protected Double weight;
    protected Double inch;
    protected Double age;
    protected Double feet;
    int baseCalories;
    double weightFactor;
    double feetFactor;
    int feetTransferInch;
    double ageFactor;

    public Person(Double weight, Double inch, Double age, Double feet) {
        this.weight = weight;
        this.inch = inch;
        this.age = age;
        this.feet = feet;

    }
    public double calculateCalories(){
        return  baseCalories
                + (weightFactor * weight)
                + (feetFactor * ((feet * feetTransferInch)
                + inch))
                - (ageFactor * age);
    }

}
