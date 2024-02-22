package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int firstBase;
    private int secondBase;

    public IsoscelesTrapezoid(String color, int height, int firstBase, int secondBase) {
        super(color);
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    @Override
    public double getArea() {
        return height * (firstBase + secondBase) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "IsoscelesTrapezoid, area: " + getArea()
                + " sq.units," + "height: " + height + " units, " + "firstBase: "
                + firstBase + " units, " + "secondBase: " + secondBase + " units, "
                + "color: " + color);
    }
}
