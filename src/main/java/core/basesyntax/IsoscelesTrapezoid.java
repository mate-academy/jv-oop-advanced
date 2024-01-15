package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int longBase;
    private int shortBase;

    private int heightBase;

    public IsoscelesTrapezoid(Color color, int longBase, int shortBase, int heightBase) {
        super(color);
        this.longBase = longBase;
        this.shortBase = shortBase;
        this.heightBase = heightBase;
    }

    public double getHeight() {
        return heightBase;
    }

    public double getLongBase() {
        return longBase;
    }

    public double getShortBase() {
        return shortBase;
    }

    @Override
    public double area() {
        return ((longBase + shortBase) * heightBase) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Shape: isosceles trapezoid, area: " + area()
                + "sq. units, longBase: " + longBase
                + "sq. units, shortBase: " + shortBase + "sq. units, height: "
                + heightBase + "sq. units, color: " + getColor());
    }
}
