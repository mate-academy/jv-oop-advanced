package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottomSide = 0;
    private int topSide = 0;
    private int height = 0;

    public IsoscelesTrapezoid(String color, int bottomSide, int topSide, int height) {
        super(color);
        this.height = height;
        this.topSide = topSide;
        this.bottomSide = bottomSide;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, top side: " + topSide + " units, bottom side: "
                + bottomSide + " units, color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return (bottomSide + topSide) / 2 * height;
    }
}
