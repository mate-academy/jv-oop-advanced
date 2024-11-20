package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double longBase;
    private double shortBase;
    private double height;

    public IsoscelesTrapezoid(String color, double longBase, double shortBase, double height) {
        super(color);
        this.longBase = longBase;
        this.shortBase = shortBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (longBase + shortBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles Trapezoid - longBase,  shortBase, height:" + longBase
                + shortBase + height + "and the area is:" + calculateArea());

    }
}
