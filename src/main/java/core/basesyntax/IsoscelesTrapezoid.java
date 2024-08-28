package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int shortBase;
    private int longBase;
    private int height;

    public IsoscelesTrapezoid(String color, int shortBase, int longBase, int height) {
        super(color);
        this.shortBase = shortBase;
        this.longBase = longBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((shortBase + longBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid short base: " + shortBase
                + " long base: " + longBase + " height: " + height
                + " area " + getArea() + " Color " + getColor());
    }
}
