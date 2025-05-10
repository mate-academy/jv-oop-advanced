package core.basesyntax;

public class RightTriangle extends Figure {
    private double catFirst;
    private double catSecond;

    public RightTriangle(double catFirst, double catSecond, String color) {
        super(color);
        this.catFirst = catFirst;
        this.catSecond = catSecond;
    }

    @Override
    public double getArea() {
        return (catFirst * catSecond) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq.units, catFirst " + catFirst
                + " units, catSecond " + catSecond
                + " units, color: " + getColor());
    }
}
