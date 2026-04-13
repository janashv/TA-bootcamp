package module9.activity;

public class Person {

    private int weight;   // in kg
    private float height; // in meters

    //getters and setters
    public void setHeight(float height) {
        this.height = height;
    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    //bmi calculation
    public String getBodyMassIndex(int weight, float height) {

        //validation
        if (weight <= 0 || height <= 0) {
            return "Invalid input: weight and height must be greater than 0";
        }

        if (weight > 500 || height > 3) {
            return "Invalid input: unrealistic weight or height";
        }

        //bmi calculation
        double bmi = weight / (height * height);

        return "BMI is: " + String.format("%.2f", bmi);
    }
}