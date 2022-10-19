package core.basesyntax;

public class Rectangle extends Side2Figure implements Squarable {
    public Rectangle(String color, int a, int b) {
        super(color, a, b);
    }

    @Override
    public double getSquare() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "rectangle, area: " + getSquare()
                + " sq.units, firstLeg: " + sideA
                + " units, secondLeg: " + sideB
                + " units, color: " + color.toLowerCase();
    }
}
