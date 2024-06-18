package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * (firstSide * secondSide) * height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("\nFigure: Isosceles Trapezoid"
                + " area: "
                + getArea()
                + " units, firstLeg: "
                + firstSide
                + " units, secondLeg: "
                + secondSide
                + " units thirdLeg: "
                + height
                + " color: "
                + getColor());
    }
}
