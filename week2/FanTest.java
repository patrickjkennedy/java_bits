package java_bits.week2;

public class FanTest {

    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow");
        Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "blue");
        System.out.print(fan1 + "\n" + fan2);
    }
}
