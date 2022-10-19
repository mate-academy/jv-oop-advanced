package core.basesyntax;

public class RightTriangle extends Side2Figure implements Squarable {
    public RightTriangle(String color, int a, int b) {
        super(color, a, b);
    }

    @Override
    public double getSquare() {
        return sideA * sideB / 2.;
    }

    @Override
    public String toString() {
        return "triangle, area: " + getSquare()
                + " sq.units, firstLeg: " + sideA
                + " units, secondLeg: " + sideB
                + " units, color: " + color.toLowerCase();
    }
}
