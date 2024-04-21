package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperBase;
    private int lowerBase;
    private int height;
    private String color;

    public IsoscelesTrapezoid(int upperBase, int lowerBase, int height, String color) {
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
        this.color = color;
    }

    @Override
    public int getArea() {
        return ((upperBase + lowerBase) * height) / 2;
    }

    @Override
    public String draw() {
        return "Figure: isoscelesTrapezoid, area: " + getArea() + " sq. units, upperBase: "
                + upperBase + " units, lowerBase: " + lowerBase + " units, height: "
                + height + " units, color: " + color;
    }
}
