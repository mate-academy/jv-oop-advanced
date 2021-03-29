package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseOne;
    private int baseTwo;
    private int height;

    public IsoscelesTrapezoid(String name, String color, int baseOne,
                              int baseTwo, int height) {
        super(name, color);
        this.baseOne = baseOne;
        this.baseTwo = baseTwo;
        this.height = height;
    }

    public int getBaseOne() {
        return baseOne;
    }

    public void setBaseOne(int baseOne) {
        this.baseOne = baseOne;
    }

    public int getBaseTwo() {
        return baseTwo;
    }

    public void setBaseTwo(int baseTwo) {
        this.baseTwo = baseTwo;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (baseOne + baseTwo) * height / 2.0;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ", Area: " + getArea()
                + " sq. units, base 1: " + getBaseOne() + " units, base 2: "
                + getBaseTwo() + " units, height: " + getHeight() + " units, color: "
                + getColor());
    }
}
