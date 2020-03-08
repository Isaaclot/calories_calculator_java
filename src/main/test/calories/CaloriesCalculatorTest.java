package calories;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author
 * @since 2020/3/6 2:48 PM
 */
public class CaloriesCalculatorTest {

    @Test
    public void test_calculate_calories_male_5feet_1inch_110pound_12age() {
        CaloriesCalculator caloriesCalculator = new CaloriesCalculator();
        assertThat(caloriesCalculator.calculateCalories("Male", 110D, 1D, 12D, 5D), is("1464.3"));
    }

    @Test
    public void test_calculate_calories_female_5feet_1inch_110pound_12age() {
        CaloriesCalculator caloriesCalculator = new CaloriesCalculator();
        assertThat(caloriesCalculator.calculateCalories("Female", 110D, 1D, 12D, 5D), is("1358.3"));
    }

    @Test
    public void test_calculate_calories_female_7feet_2inch_180pound_42age() {
        CaloriesCalculator caloriesCalculator = new CaloriesCalculator();
        assertThat(caloriesCalculator.calculateCalories("Female", 180D, 2D, 42D, 7D), is("1635.8"));
    }

    @Test
    public void testInitGardenData_Load_12GardenList() {
        assertThat(new CaloriesCalculator().initGardenData().size(), is(12));
    }
}