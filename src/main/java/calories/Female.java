package calories;

/**
 * @author 卡路里
 * @since 2020/3/5 9:21 PM
 */
public class Female extends Person {
    public Female(Double weight, Double height, Double inch, Double age) {
        super(weight, height, inch, age);
        baseCalories = 655;
        weightFactor = 4.3;
        ageFactor = 4.7;
        heightFactor = 4.7;
    }

}
