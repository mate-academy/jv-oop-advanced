package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(String color, int upperBase, int lowerBase, int height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    public void setUpperBase(int upperBase) {
        this.upperBase = upperBase;
    }

    public int getUpperBase() {
        return this.upperBase;
    }

    public void setLowerBase(int lowerBase) {
        this.lowerBase = lowerBase;
    }

    public int getLowerBase() {
        return this.lowerBase;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public double getArea() {
        return (upperBase + lowerBase) * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("isosceles trapezoid, area: " + this.getArea()
                + " sq. units, upper base: "
                + this.upperBase + ", lower base: " + this.lowerBase + ", height: "
                + this.height + " , color: " + this.getColor());
    }
}
