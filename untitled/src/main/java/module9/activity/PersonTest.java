package module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;

    //setup
    protected void setUp() {
        person = new Person();
    }

    //teardown
    protected void tearDown() {
        person = null;
    }
    //getters and setters
    public void testGettersAndSetters() {
        person.setWeight(66);
        person.setHeight(1.70f);

        assertEquals(66, person.getWeight());
        assertEquals(1.70f, person.getHeight());
    }

    //test bmi calculation
    public void testBMIValid() {
        String result = person.getBodyMassIndex(66, 1.70f);
        assertTrue(result.contains("BMI is"));
    }

    //test bmi invalid
    public void testBMIInvalidZero() {
        String result = person.getBodyMassIndex(0, 1.70f);
        assertEquals("Invalid input:" +
                " weight and height must be greater than 0", result);
    }

    //test negative values
    public void testBMINegative() {
        String result = person.getBodyMassIndex(-10, 1.70f);
        assertEquals("Invalid input: weight and height must be greater than 0", result);
    }

    //tests unrealistic values
    public void testBMITooLarge() {
        String result = person.getBodyMassIndex(4300, 5f);
        assertEquals("Invalid input: unrealistic weight or height", result);
    }
}