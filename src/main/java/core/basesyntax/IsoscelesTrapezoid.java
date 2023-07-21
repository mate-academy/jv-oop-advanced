package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int smallSide;
    private int bigSide;
    private int height;

    public IsoscelesTrapezoid(String color, int smallSide, int bigSide, int height) {
        super(color);
    }

    @Override
    public int area() {
        return (smallSide + bigSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getType() + " area: " + area()
                + "sq.units, small side: " + smallSide
                + " units, big side " + bigSide + " units, height "
                + height + " units, color: " + getColor());
    }

    @Override
    public String getType() {
        return "isosceles trapezoid";
    }
}
