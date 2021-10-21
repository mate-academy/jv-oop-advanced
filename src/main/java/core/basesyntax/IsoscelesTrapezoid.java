package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int side;
    private double height;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int side) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.side = side;
        getHeight();
    }

    private void getHeight() {
        double difference = topBase < bottomBase
                ? (bottomBase - topBase) / 2.0 : (topBase - bottomBase) / 2.0;
        height = Math.sqrt((side * side) - (difference * difference));
    }

    @Override
    public double getArea() {
        return Math.round((0.5 * (topBase + bottomBase) * height) * 100) / 100.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, topBase: " + topBase
                + " units, bottomBase: " + bottomBase
                + " units, side: " + side
                + " units, color: " + getColor());
    }
}
