package core.basesyntax.figures.geometric;

import core.basesyntax.figures.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int largerBase;
    private int smallerBase;
    private int height;

    public IsoscelesTrapezoid(String color, int largerBase, int smallerBase, int height) {
        super(color);
        this.largerBase = largerBase;
        this.smallerBase = smallerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (largerBase + smallerBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, "
                + "area " + df.format(getArea()) + " sq. units, "
                + "largerBase: " + largerBase + " units, "
                + "smallerBase: " + smallerBase + " units, "
                + "height: " + height + " units, "
                + "color: " + color.toLowerCase());
    }
}
