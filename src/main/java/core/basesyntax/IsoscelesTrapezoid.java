package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final int DIVISION_NUMBER = 2;
    private final int firstSide;
    private final int secondSide;
    private final int height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * ((firstSide + secondSide) / DIVISION_NUMBER);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, first side: " + firstSide
                + " units, second side: " + secondSide + " units, color: " + color);
    }
}
