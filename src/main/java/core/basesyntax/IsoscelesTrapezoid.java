package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottomSide;
    private int topSide;
    private int height;

    public IsoscelesTrapezoid(String color, int bottomSide, int topSide, int height) {
        super(color);
        this.height = height;
        this.topSide = topSide;
        this.bottomSide = bottomSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, top side: " + topSide + " units, bottom side: "
                + bottomSide + " units, height: " + height + " color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return (bottomSide + topSide) / 2 * height;
    }
}
