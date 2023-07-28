package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseOne;
    private double baseTwo;
    private double height;

    public IsoscelesTrapezoid(String color, double baseOne, double baseTwo, double height) {
        super(color);
        this.baseOne = baseOne;
        this.baseTwo = baseTwo;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (baseOne + baseTwo) / 2 * height;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.printf(", baseOne: %f, baseTwo: %f, height: %f, color: %s%n",
                baseOne, baseTwo, height, getColor());
    }
}
