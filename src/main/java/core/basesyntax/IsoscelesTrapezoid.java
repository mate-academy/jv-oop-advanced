package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseLength;
    private double lengthOfShortBase;
    private double height;

    public IsoscelesTrapezoid(String color, double baseLength,
                              double lengthOfShortBase, double height) {
        super(color);
        this.baseLength = baseLength;
        this.lengthOfShortBase = lengthOfShortBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (baseLength + lengthOfShortBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("This is IsoscelesTrapezoid, heigth: " + height
                + " baseLength: " + baseLength + " baseShort: "
                + lengthOfShortBase + "color: " + getColor());
    }
}
