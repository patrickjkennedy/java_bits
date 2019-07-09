package java_bits.week2;

public class Fan {
    // Class Variables
    // These are static as we want them to be associated with the class itself, not just a particular instance.
    // https://stackoverflow.com/questions/10963775/cannot-reference-x-before-supertype-constructor-has-been-called-where-x-is-a
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Instance Variables
    private int speed;
    private boolean on;
    private double radius;
    private String colour;

    public Fan(int speed, boolean on, double radius, String colour) {
        // In this constructor I'm using the setter methods I've defined below.
        // This is another way of defining a constructor and mostly just gives our setters something to do in this example.
        // Compare this with the constructor in Stock.class.
        setSpeed(speed);
        setOn(on);
        setRadius(radius);
        setColour(colour);
    }

    public Fan() {
        this(SLOW, false, 5, "blue");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        if (isOn()) {
            return "Fan speed: " + getSpeed() + " | Colour: " + getColour() + " | Radius: " + getRadius();
        }
        return "Fan is off | Colour: " + getColour() + " | Radius: " + getRadius();

    }
}
