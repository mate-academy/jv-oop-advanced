package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int topSide;
    private final int downside;

    public IsoscelesTrapezoid(Color color, int height, int topSide, int downside) {
        super.setColor(color);
        this.height = height;
        this.topSide = topSide;
        this.downside = downside;
    }

    @Override
    public double getArea() {
        return (double) ((topSide + downside) / 2) * height;
    }

    @Override
    public void drawFigure(Figure randomFigure) {
        System.out.println("Figure: isosceless trapezoid, area : " + getArea() + " sq.units, height: " + height + " units,downside : " + downside + " units, top side: " + topSide + " units, color: " + getColor());
    }
}
