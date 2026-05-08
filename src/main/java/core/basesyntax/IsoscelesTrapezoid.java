package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private Double shortBase;
    private Double longBase;
    private Double legsLength;
    private Double height;
    private Double baseAngle;

    public IsoscelesTrapezoid(Double shortBase, Double longBase, Double legsLength,
                              Double height, Double baseAngle, String color) {
        super(color, FigureType.ISOSCELES_TRAPEZOID);
        this.shortBase = shortBase;
        this.longBase = longBase;
        this.legsLength = legsLength;
        this.height = height;
        this.baseAngle = baseAngle;
    }

    public Double getShortBase() {
        return shortBase;
    }

    public void setShortBase(Double shortBase) {
        this.shortBase = shortBase;
    }

    public Double getLongBase() {
        return longBase;
    }

    public void setLongBase(Double longBase) {
        this.longBase = longBase;
    }

    public Double getLegsLength() {
        return legsLength;
    }

    public void setLegsLength(Double legsLength) {
        this.legsLength = legsLength;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getBaseAngle() {
        return baseAngle;
    }

    public void setBaseAngle(Double baseAngle) {
        this.baseAngle = baseAngle;
    }

    @Override
    public Double getArea() {
        return (longBase + shortBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, long base: " + longBase
                + " units, short base: " + shortBase
                + " units, legs length: " + legsLength
                + " units, height: " + height
                + " units, base angle: " + baseAngle
                + " units, color: " + getColor() + "\n");
    }
}
