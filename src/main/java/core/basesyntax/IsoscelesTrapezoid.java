package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double bottomBase;
    private double topBase;
    private double height;

    public IsoscelesTrapezoid(String color, double baseOne, double baseTwo, double height) {
        super(color);
        this.bottomBase = baseOne;
        this.topBase = baseTwo;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (bottomBase + topBase) / 2 * height;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.printf(", baseOne: %f, baseTwo: %f, height: %f, color: %s%n",
                bottomBase, topBase, height, getColor());
    }
}
