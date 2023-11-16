package core.basesyntax;

public class RightTriangle extends Figure {
    private final double side;
    private final double height;

    public RightTriangle(Color color, double side, double height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    public double calculateArea() {
        return round((side * height) / 2);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle"
                        + ", firstLeg: " + round(side) + " units"
                        + ", secondLeg: " + round(height) + " units"
                        + ", area: " + calculateArea() + " sq. units"
                        + ", color: " + color
        );
    }
}
