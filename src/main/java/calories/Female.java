package calories;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/6 2:59 PM
 */
public class Female extends Person {

    public Female(Double weight, Double inch, Double age, Double feet) {
        super(weight, inch, age, feet);
        baseCalories = 655;
        weightFactor = 4.3;
        feetFactor = 4.7;
        feetTransferInch = 12;
        ageFactor = 4.7;
    }
}
