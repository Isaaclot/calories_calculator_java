package calories;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author 卡路里
 * @since 2020/3/5 6:58 PM
 */
public class CaloriesCalculatorTest {

    @Test
    public void should_caloriesCalculator_male_height5_inch1_weight110_age12() {
        CaloriesCalculator caloriesCalculator = new CaloriesCalculator();
        Double calories = caloriesCalculator.caloriesCalculator(true, 110D, 5D, 1D, 12D);
        assertThat(calories, is(1464.3));
    }

    @Test
    public void should_caloriesCalculator_male_height7_inch2_weight180_age42() {
        CaloriesCalculator caloriesCalculator = new CaloriesCalculator();
        Double calories = caloriesCalculator.caloriesCalculator(true, 180D, 7D, 2D, 42D);
        assertThat(calories, is(2023.8));
    }

    @Test
    public void should_caloriesCalculator_female_height5_inch1_weight110_age12() {
        CaloriesCalculator caloriesCalculator = new CaloriesCalculator();
        Double calories = caloriesCalculator.caloriesCalculator(false, 110D, 5D, 1D, 12D);
        assertThat(calories, is(1358.3));
    }
}