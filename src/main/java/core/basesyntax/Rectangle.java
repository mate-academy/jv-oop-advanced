package core.basesyntax;

public class Rectangle extends Figure {
    private double aSide;
    private double bSide;

    public Rectangle(Color color, double aSide, double bSide) {
        super(color);
        this.aSide = aSide;
        this.bSide = bSide;
    }

    @Override
    public double getArea() {
        return (aSide * bSide);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: " + this.getArea()
        + " sq. units, A side: " + aSide + " units, B side: "
        + bSide + " color: " + getColor());
    }
}
