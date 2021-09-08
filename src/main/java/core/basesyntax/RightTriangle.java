package core.basesyntax;

public class RightTriangle extends Figure {
    private double leg;

    public RightTriangle(String color,double leg) {
        super(color);
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) * leg * leg) / 4;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: right triangle, " + "area: " + getArea() + " sq.units," + " leg: " + leg + " units," + " color: " + getColor());
    }
}
