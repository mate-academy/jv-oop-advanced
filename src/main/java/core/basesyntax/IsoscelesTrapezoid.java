package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int smallSide;
    private int bigSide;
    private int height;

    public IsoscelesTrapezoid(String color, int smallSide, int bigSide, int height) {
        super(color);
    }

    @Override
    public int getArea() {
        return (smallSide + bigSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + "sq.units, small side: " + smallSide
                + " units, big side " + bigSide + " units, height "
                + height + " units, color: " + getColor());
    }
}
