package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, Drawable {
    private final int firstSide;
    private final int secondSide;
    private final int height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, first side: "
                + firstSide + " units, second side: "
                + secondSide + " units, height: " + height
                + " units, color: " + getColor();
    }

    @Override
    public double getArea() {
        return ((firstSide + secondSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }
}
