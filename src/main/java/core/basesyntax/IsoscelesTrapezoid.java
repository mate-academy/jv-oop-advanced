package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int side;
    private int height;

    public IsoscelesTrapezoid(String color, int side, int height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return Math.round(((side * 2) / 2) * height);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + Double.toString(getArea())
                + " sq.units, side: " + side
                + " units, height: " + height
                + " units, color: " + getColor().toLowerCase());
    }
}
