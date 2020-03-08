package calories;

import junit.framework.TestCase;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author
 * @since 2020/3/8 9:32 PM
 */
public class PersonTest extends TestCase {

    public void testCalculateCalories_male() {
        String calories = new Person(GenderEnum.getByGarden("Male"), 110D, 1D, 12D, 5D).calculateCalories();
        assertThat(calories, is("1464.3"));
    }

    public void testCalculateCalories_female() {
        String calories = new Person(GenderEnum.getByGarden("Female"), 110D, 1D, 12D, 5D).calculateCalories();
        assertThat(calories, is("1358.3"));
    }

    public void testCalculateCalories_X0() {
        String calories = new Person(GenderEnum.getByGarden("X0"), 110D, 1D, 12D, 5D).calculateCalories();
        assertThat(calories, is("1363.3"));
    }

    public void testCalculateCalories_X1() {
        String calories = new Person(GenderEnum.getByGarden("X1"), 110D, 1D, 12D, 5D).calculateCalories();
        assertThat(calories, is("1364.3"));
    }

    public void testCalculateCalories_X2() {
        String calories = new Person(GenderEnum.getByGarden("X2"), 110D, 1D, 12D, 5D).calculateCalories();
        assertThat(calories, is("1365.3"));
    }

    public void testCalculateCalories_X3() {
        String calories = new Person(GenderEnum.getByGarden("X3"), 110D, 1D, 12D, 5D).calculateCalories();
        assertThat(calories, is("1366.3"));
    }

    public void testCalculateCalories_X4() {
        String calories = new Person(GenderEnum.getByGarden("X4"), 110D, 1D, 12D, 5D).calculateCalories();
        assertThat(calories, is("1367.3"));
    }

    public void testCalculateCalories_X5() {
        String calories = new Person(GenderEnum.getByGarden("X5"), 110D, 1D, 12D, 5D).calculateCalories();
        assertThat(calories, is("1368.3"));
    }

    public void testCalculateCalories_X6() {
        String calories = new Person(GenderEnum.getByGarden("X6"), 110D, 1D, 12D, 5D).calculateCalories();
        assertThat(calories, is("1369.3"));
    }

    public void testCalculateCalories_X7() {
        String calories = new Person(GenderEnum.getByGarden("X7"), 110D, 1D, 12D, 5D).calculateCalories();
        assertThat(calories, is("1370.3"));
    }

    public void testCalculateCalories_X8() {
        String calories = new Person(GenderEnum.getByGarden("X8"), 110D, 1D, 12D, 5D).calculateCalories();
        assertThat(calories, is("1371.3"));
    }

    public void testCalculateCalories_X9() {
        String calories = new Person(GenderEnum.getByGarden("X9"), 110D, 1D, 12D, 5D).calculateCalories();
        assertThat(calories, is("1372.3"));
    }

}