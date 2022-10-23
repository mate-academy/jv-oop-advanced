package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double baseOne;
    private final double baseTwo;
    private final double height;

    public IsoscelesTrapezoid(String color, double baseOne, double baseTwo, double height) {
        super(color);
        this.baseOne = baseOne;
        this.baseTwo = baseTwo;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((baseOne + baseTwo) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, base one: " + baseOne + " units, base two: "
                + baseTwo + " units, height: " + height + " units, color: "
                + color.toLowerCase());
    }
}
