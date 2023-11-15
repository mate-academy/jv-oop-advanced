package core.basesyntax;

public class RightTriangle extends Figure {
    private final double side;
    private final double height;

    public RightTriangle(Color color, double side, double height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    public double getArea() {
        return round((side * height) / 2);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle"
                        + ", firstLeg: " + round(side) + " units"
                        + ", secondLeg: " + round(height) + " units"
                        + ", area: " + getArea() + " sq. units"
                        + ", color: " + color
        );
    }
}
