package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int shortBase;
    private int longBase;

    public IsoscelesTrapezoid(String color, int height, int shortBase, int longBase) {
        super(color);
        this.height = height;
        this.shortBase = shortBase;
        this.longBase = longBase;
    }

    @Override
    public double getArea() {
        return Math.round((shortBase + longBase) * height / 2) * 10.0 / 10.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, "
                + "height: " + height + " units, short base: "
                + shortBase + " units, long base: " + longBase + " units, color: " + getColor());
    }
}
