package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topBase;
    private final double bottomBase;
    private final double side;

    public IsoscelesTrapezoid(double topBase, double bottomBase, double side, String color) {
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.side = side;
        this.color = color;
    }

    private double calculateHeight(double firstParallel, double secondParallel, double side) {
        return Math.pow(side, 2) - Math.pow(firstParallel - secondParallel, 2) / 4;
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) * calculateHeight(topBase, bottomBase, side) / 2;
    }

    @Override
    public void draw() {
        System.out.println(
                "Shape: isosceles trapezium, area: " + getArea() + " sq. units,"
                        + " first parallel: " + topBase + " unit.,"
                        + " second parallel: " + bottomBase + " unit.,"
                        + " side: " + side + " unit.,"
                        + " color: " + color);
    }
}
