package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int longerBase;
    private int shorterBase;

    public IsoscelesTrapezoid(String color, int height, int longerBase, int shorterBase) {
        super(color);
        this.height = height;
        this.longerBase = longerBase;
        this.shorterBase = shorterBase;
    }

    @Override
    public int obtainArea() {
        return (longerBase + shorterBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + obtainArea() + " sq. units, height: "
                + height + " units, longerBase: "
                + longerBase + " units, shorterBase: "
                + shorterBase + "units, color: "
                + getColor());
    }
}
