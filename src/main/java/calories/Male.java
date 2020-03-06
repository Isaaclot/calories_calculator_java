package calories;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/6 2:58 PM
 */
public class Male extends Person {

    public Male(Double weight, Double inch, Double age, Double feet) {
        super(weight, inch, age, feet);
        baseCalories = 66;
        weightFactor = 6.3;
        feetFactor = 12.9;
        feetTransferInch = 12;
        ageFactor = 6.8;
    }
}
