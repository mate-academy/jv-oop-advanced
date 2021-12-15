package core.basesyntax;

public class RightTriangle extends Figure {
    private double baseSide;
    private double height;

    public RightTriangle() {

    }

    public RightTriangle(double baseSide, double height) {
        this.baseSide = baseSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return baseSide * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: " + String.format("%.1f", getArea())
                + " sq.units, baseSide: " + baseSide + " units, height:  " + height
                + " units, color: " + getColor());
    }
}
