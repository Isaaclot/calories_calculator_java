package calories;

/**
 * @author 卡路里
 * @since 2020/3/5 9:19 PM
 */
public class Male extends Person {


    public Male(Double weight, Double height, Double inch, Double age) {
        super(weight, height, inch, age);
        weightFactor = 6.3;
        heightFactor = 12.9;
        ageFactor = 6.8;
        baseCalories = 66;
    }

}
